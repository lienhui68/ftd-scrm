package com.eh.util;

import com.eh.constants.WxConstants;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * Created by David Li on 2015/12/3.
 */
public class ValidUtil {

    public static boolean valid(String signature, String timestamp, String nonce, String token) {
        String encrypted = ValidUtil.generateSignature(timestamp, nonce, token);
        return signature.equalsIgnoreCase(encrypted);
    }

    private static String generateSignature(String timestamp, String nonce, String token) {
        String[] toBeSort = new String[] { token, timestamp, nonce };
        Arrays.sort(toBeSort);
        String sorted = null;
        StringBuffer bf = new StringBuffer();
        for (String str : toBeSort) {
            bf.append(str);
        }
        sorted = bf.toString();

        String encrypted = ValidUtil.encryptWithSha1(sorted);

        return encrypted;
    }

    public static String encryptWithSha1(String input) {
        MessageDigest msgDigest = null;
        String str = null;
        try {
            // SHA-1（如果想要SHA1参数换成”MD5”）
            msgDigest = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e) {
        }

        if (null != msgDigest) {
            // 输入的字符串转换成字节数组
            byte[] bt = input.getBytes();
            // bt是输入字符串转换得到的字节数组
            msgDigest.update(bt);
            // msgDigest.digest() 转换并返回结果，也是字节数组
            str = ValidUtil.byte2hex(msgDigest.digest());
        }

        return str;
    }

    private final static String byte2hex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        String tmp = null;
        for (byte b : bytes) {
            tmp = Integer.toHexString(b & 0xFF);
            if (tmp.length() == 1) {
                sb.append(WxConstants.STRING_EMPTY_INT);
            }
            sb.append(tmp);
        }
        return sb.toString();
    }
}

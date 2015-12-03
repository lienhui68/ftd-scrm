package com.eh.channel.wechat;

import com.eh.channel.ChannelMessageFactory;
import com.eh.model.Account;
import com.eh.util.ValidUtil;

import java.util.Map;

/**
 * Created by David Li on 2015/12/3.
 */
public class WechatmMessageFactory extends ChannelMessageFactory {

    @Override
    public Object messageEntryValidate(Map<String, String> params, Account account) {
        String signature = params.get("signature");
        String timestamp = params.get("timestamp");
        String nonce = params.get("nonce");
        String echostr = params.get("echostr");
        boolean valid = ValidUtil.valid(signature, timestamp, nonce, account.getToken());
        return valid ? echostr : null;
    }
}

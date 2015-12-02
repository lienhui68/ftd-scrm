package com.eh.model;

import com.eh.base.Identifier;
import com.eh.enums.Channel;
import com.eh.enums.WechatAccountType;

import java.io.Serializable;

/**
 * Created by David Li on 2015/12/1.
 */
public class Account extends Identifier<String> implements Serializable {
    private static final long serialVersionUID = -2105912742258215254L;

    public static final String CHANNEL_ACCOUNT = "channelAccount";
    public static final String CHANNEL = "channel";
    public static final String APP_ID = "appId";
    public static final String APP_SECRET = "appSecret";
    public static final String NAME = "name";
    public static final String ACCOUNT_TYPE = "accountType";

    private String channelAccount;
    private String appId;
    private String appSecret;
    private String token;
    private String encodingAESKey;

    private String name;
    private Channel channel;
    private WechatAccountType accountType;
    private String url;

    public String getChannelAccount() {
        return channelAccount;
    }

    public void setChannelAccount(String channelAccount) {
        this.channelAccount = channelAccount;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getEncodingAESKey() {
        return encodingAESKey;
    }

    public void setEncodingAESKey(String encodingAESKey) {
        this.encodingAESKey = encodingAESKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public WechatAccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(WechatAccountType accountType) {
        this.accountType = accountType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

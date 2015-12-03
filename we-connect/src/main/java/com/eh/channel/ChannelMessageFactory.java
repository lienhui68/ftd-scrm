package com.eh.channel;

import com.eh.model.Account;

import java.util.Map;

/**
 * Created by David Li on 2015/12/3.
 */
public abstract class ChannelMessageFactory {
    public abstract Object messageEntryValidate(Map<String, String> params, Account account);
}

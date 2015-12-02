package com.eh.validator;

import com.eh.model.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David Li on 2015/12/2.
 */
@Component
public class AccountValidator extends BaseValidator {
    public List<String> validateAddAccount(Account account) {
        List<String> validationResult = new ArrayList<String>();
        if (account.getChannel() == null) {
            validationResult.add(buildMessageForRequired(Account.CHANNEL));
        }
        if (account.getChannelAccount() == null) {
            validationResult.add(buildMessageForRequired(Account.CHANNEL_ACCOUNT));
        }
        if (account.getAppId() == null) {
            validationResult.add(buildMessageForRequired(Account.APP_ID));
        }
        if (account.getAppSecret() == null) {
            validationResult.add(buildMessageForRequired(Account.APP_SECRET));
        }
        if (account.getAccountType() == null) {
            validationResult.add(buildMessageForRequired(Account.ACCOUNT_TYPE));
        }
        if (account.getName() == null) {
            validationResult.add(buildMessageForRequired(Account.NAME));
        }
        return validationResult;
    }

    public List<String> validateUpdateAccount(Account account) {
        List<String> validationResult = new ArrayList<String>();
        if (account.getChannel() == null) {
            validationResult.add(buildMessageForRequired(Account.CHANNEL));
        }
        if (account.getAppId() == null) {
            validationResult.add(buildMessageForRequired(Account.APP_ID));
        }
        if (account.getAppSecret() == null) {
            validationResult.add(buildMessageForRequired(Account.APP_SECRET));
        }
        if (account.getAccountType() == null) {
            validationResult.add(buildMessageForRequired(Account.ACCOUNT_TYPE));
        }
        if (account.getName() == null) {
            validationResult.add(buildMessageForRequired(Account.NAME));
        }
        return validationResult;
    }
}

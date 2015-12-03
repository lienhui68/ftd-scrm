package com.eh.service.impl;

import com.eh.base.BaseServiceImpl;
import com.eh.constants.WxConstants;
import com.eh.dao.AccountDao;
import com.eh.exception.ServiceWarningException;
import com.eh.model.Account;
import com.eh.service.AccountService;
import com.eh.util.MessageKeys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.testng.Assert;

import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by David Li on 2015/12/1.
 */
@Service
public class AccountServiceImpl extends BaseServiceImpl<String, Account, AccountDao> implements AccountService {

    @Value("${project.baseUrl}")
    private String baseUrl;

    @Override
    public Account createAccount(Account account) {
        if (isExisted(account)) {
            throw new ServiceWarningException(MessageKeys.ENTITY_ACCOUNT_ALREADY_EXISTS,
                    new String[] { account.getChannel().toString(), account.getChannelAccount() });
        }
        account.setCreatedOn(new Date());
        account.setToken(generateToken());
        account.setEncodingAESKey(generateEncodingAESKey());
        dao.insert(account);
        setUrlForAccount(account);
        return account;
    }

    @Override
    public Account updateAccount(Account account) {
        Assert.assertNotNull(account);
        Account existing = dao.findById(account.getId());
        existing.setUpdatedOn(new Date());
        existing.setName(account.getName());
        existing.setChannel(account.getChannel());
        existing.setAccountType(account.getAccountType());
        dao.update(existing);
        setUrlForAccount(existing);
        return existing;
    }

    private boolean isExisted(Account account) {
        Query query = new Query(Criteria.where(Account.CHANNEL).is(account.getChannel()));
        query.addCriteria(Criteria.where(Account.CHANNEL_ACCOUNT).is(account.getChannelAccount()));
        List<Account> accounts = dao.find(query);
        if (accounts.size() != 0) {
            return true;
        }
        return false;
    }

    private void setUrlForAccount(Account account) {
        account.setUrl(baseUrl + account.getId());
    }

    public String generateToken() {
        return generateRandomString(WxConstants.TOKEN_SIZE);
    }

    public String generateEncodingAESKey() {
        return generateRandomString(WxConstants.ENCODING_AES_KEY_SIZE);
    }

    /**
     * generate a random string according to the size,the scope is A-Z¡¢a-z¡¢0-9
     *
     * @param size the length of the random string you want to get
     * @return the string of a special length
     */
    public String generateRandomString(int size) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < size; i++) {
            int number = random.nextInt(str.length());
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
}

package com.eh.service.impl;

import com.eh.base.BaseServiceImpl;
import com.eh.dao.AccountDao;
import com.eh.model.Account;
import com.eh.service.AccountService;
import org.springframework.stereotype.Service;
import org.testng.Assert;

import java.util.Date;

/**
 * Created by David Li on 2015/12/1.
 */
@Service
public class AccountServiceImpl extends BaseServiceImpl<String, Account, AccountDao> implements AccountService {
    @Override
    public void updateAccount(Account account) {
        Assert.assertNotNull(account);
        Account existing = dao.findById(account.getId());
        existing.setUpdatedOn(new Date());
        existing.setName(account.getName());
        existing.setChannel(account.getChannel());
        existing.setAccountType(account.getAccountType());
        dao.update(existing);
    }
}

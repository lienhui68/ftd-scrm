package com.eh.dao.impl;

import com.eh.base.MongoDaoImpl;
import com.eh.dao.AccountDao;
import com.eh.model.Account;
import org.springframework.stereotype.Repository;

/**
 * Created by David Li on 2015/12/1.
 */
@Repository
public class AccountDaoImpl extends MongoDaoImpl<String, Account> implements AccountDao {

    @Override
    public Class<?> getEntityClass() {
        return Account.class;
    }
}

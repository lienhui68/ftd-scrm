package com.eh.service;

import com.eh.base.BaseService;
import com.eh.model.Account;

/**
 * Created by David Li on 2015/12/1.
 */
public interface AccountService extends BaseService<String, Account> {

    /**
     * Create given account
     *
     * @param account
     */
    Account createAccount(Account account);

    /**
     * Update given account
     *
     * @param account
     */
    Account updateAccount(Account account);
}

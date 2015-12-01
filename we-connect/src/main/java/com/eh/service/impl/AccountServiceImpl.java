package com.eh.service.impl;

import com.eh.base.BaseServiceImpl;
import com.eh.dao.AccountDao;
import com.eh.model.Account;
import com.eh.service.AccountService;
import org.springframework.stereotype.Service;

/**
 * Created by David Li on 2015/12/1.
 */
@Service
public class AccountServiceImpl extends BaseServiceImpl<String, Account, AccountDao> implements AccountService {
}

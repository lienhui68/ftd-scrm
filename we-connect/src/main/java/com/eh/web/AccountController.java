package com.eh.web;

import com.eh.base.web.BaseController;
import com.eh.base.web.ResponseWrapper;
import com.eh.exception.ServiceWarningException;
import com.eh.model.Account;
import com.eh.service.AccountService;
import com.eh.util.MessageKeys;
import com.eh.validator.AccountValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by David Li on 2015/12/1.
 */
@Controller
@RequestMapping("accounts")
public class AccountController extends BaseController {
    @Autowired
    private AccountService accountService;

    @Autowired
    private AccountValidator accountValidator;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public ResponseWrapper addAccount(@RequestBody Account account) {
        List<String> validationMsgs = accountValidator.validateAddAccount(account);
        if (validationMsgs.size() > 0) {
            throw new ServiceWarningException(MessageKeys.ENTITY_CREATE_FAILED, new String[] { "account" }, validationMsgs);
        }
        account = accountService.createAccount(account);
        return new ResponseWrapper(account);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseWrapper deleteAccount(@PathVariable String id) {
        accountService.delete(id);
        return new ResponseWrapper();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public ResponseWrapper updateAccount(@PathVariable String id, @RequestBody Account account) {
        List<String> validationMsgs = accountValidator.validateUpdateAccount(account);
        if (validationMsgs.size() > 0) {
            throw new ServiceWarningException(MessageKeys.ENTITY_UPDATE_FAILED, new String[] { "account" }, validationMsgs);
        }
        account.setId(id);
        account = accountService.updateAccount(account);
        return new ResponseWrapper(account);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseWrapper findUserById(@PathVariable String id) {
        Account account = accountService.findById(id);
        return new ResponseWrapper(account);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public ResponseWrapper findAllUser() {
        List<Account> accounts = accountService.findAll();
        return new ResponseWrapper(accounts);
    }

}

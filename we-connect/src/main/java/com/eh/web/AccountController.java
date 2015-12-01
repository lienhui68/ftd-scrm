package com.eh.web;

import com.eh.base.web.ResponseWrapper;
import com.eh.model.Account;
import com.eh.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by David Li on 2015/12/1.
 */
@Controller
@RequestMapping("accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public ResponseWrapper addAccount(@RequestBody Account account) {
        account = accountService.create(account);
        return new ResponseWrapper(account);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseWrapper deletAccount(@PathVariable String id) {
        accountService.delete(id);
        return new ResponseWrapper();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public ResponseWrapper updateAccount(@PathVariable String id, @RequestBody Account account) {
        account.setId(id);
        accountService.update(account);
        return new ResponseWrapper();
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

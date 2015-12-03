package com.eh.irs;

import com.eh.base.web.BaseController;
import com.eh.channel.WechatmMessageFactory;
import com.eh.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by David Li on 2015/12/3.
 */
@Controller
@RequestMapping("/{accountId}")
public class InteractResponseServiceController extends BaseController {
    @Autowired
    private AccountDao accountDao;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Object validate(@PathVariable String accountId, @RequestParam Map<String, String> params) {
        return (new WechatmMessageFactory()).messageEntryValidate(params, accountDao.findById(accountId));
    }
}

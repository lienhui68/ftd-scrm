package com.eh.validator;

import com.eh.util.MessageBuilder;
import com.eh.util.MessageKeys;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by David Li on 2015/12/2.
 */
@Component
public class BaseValidator {

    @Resource
    protected MessageBuilder messageBuilder;

    public String buildMessageForRequired(String field) {
        return messageBuilder.buildMessage(MessageKeys.REQUIRED_FILED_NOT_FOUND, new String[] { field });
    }
}

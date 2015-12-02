package com.eh.base.web;

import com.eh.exception.ExceptionData;
import com.eh.exception.ServiceWarningException;
import com.eh.util.MessageBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by David Li on 2015/12/2.
 */
public class BaseController {

    @Autowired
    private MessageBuilder messageBuilder;

    @ExceptionHandler(ServiceWarningException.class)
    @ResponseBody
    public ResponseWrapper serviceWarningExceptionHandler(ServiceWarningException exception) {
        ResponseWrapper responseWrapper = new ResponseWrapper(ResponseWrapper.Status.PRECONDITION_FAILD);
        if (exception.getCode() != null) {
            ExceptionData exceptionData = new ExceptionData(
                    messageBuilder.buildMessage(exception.getCode(), exception.getParams()), exception.getDetails());
            responseWrapper.setData(exceptionData);
        }
        return responseWrapper;
    }
}

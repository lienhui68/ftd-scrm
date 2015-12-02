package com.eh.exception;

import com.eh.base.BaseModel;

import java.util.Collection;

/**
 * Created by David Li on 2015/12/2.
 */
public class ExceptionData extends BaseModel {

    /** Error message */
    private String errorMsg;

    /** Error message details as list */
    private Collection<?> details;

    public ExceptionData(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ExceptionData(String errorMsg, Collection<?> details) {
        this.errorMsg = errorMsg;
        this.details = details;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Collection<?> getDetails() {
        return details;
    }

    public void setDetails(Collection<?> details) {
        this.details = details;
    }
}

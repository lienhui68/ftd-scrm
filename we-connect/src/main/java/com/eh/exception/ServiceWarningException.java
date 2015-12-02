package com.eh.exception;

import java.util.Collection;

/**
 * Created by David Li on 2015/12/2.
 */
public class ServiceWarningException extends RuntimeException {

    private static final long serialVersionUID = 1890628559210540817L;

    /**
     * The message key
     */
    private String code;

    /**
     * The message parameters
     */
    private Object[] params;

    /** The detail information, expected to appear in the response payload */
    private Collection<?> details;

    public ServiceWarningException(String code, Object[] params) {
        setCode(code);
        setParams(params);
    }

    public ServiceWarningException(String code, Object[] params, Collection<?> details) {
        setCode(code);
        setParams(params);
        setDetails(details);
    }

    public ServiceWarningException(String message, String code) {
        super(message);
        this.code = code;
    }

    public ServiceWarningException(String message, String code, Object[] params) {
        super(message);
        setCode(code);
        setParams(params);
    }

    public ServiceWarningException(String message, String code, Object[] params, Collection<?> details) {
        super(message);
        setCode(code);
        setParams(params);
        setDetails(details);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public Collection<?> getDetails() {
        return details;
    }

    public void setDetails(Collection<?> details) {
        this.details = details;
    }
}

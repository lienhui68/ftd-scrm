package com.eh.base;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * Created by David Li on 2015/12/1.
 */
public class BaseModel implements Serializable {

    private static final long serialVersionUID = 8104965641898890249L;

    @Override
    public String toString() {
        try {
            return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
        } catch (Exception e) {
            return super.toString();
        }
    }
}

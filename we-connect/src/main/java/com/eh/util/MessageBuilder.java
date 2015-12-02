package com.eh.util;

import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import java.util.Locale;

/**
 * Created by David Li on 2015/12/2.
 */
@Component
public class MessageBuilder implements ServletContextAware {
    private static final String CONTEXT_ATTRIBUTE = WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;

    private ServletContext servletContext;

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    public String buildMessage(String key, Object[] params) {
        WebApplicationContext context = (WebApplicationContext) this.servletContext.getAttribute(CONTEXT_ATTRIBUTE);
        return context.getMessage(key, params, Locale.ENGLISH);
    }

    public String buildMessage(String key) {
        return buildMessage(key, null);
    }
}

package com.example;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.util.logging.Logger;
import java.util.logging.Level;

@WebListener
public class SessionAttributeListener implements HttpSessionAttributeListener {
    
    private static final Logger logger = Logger.getLogger(SessionAttributeListener.class.getName());
    
    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        if ("inputString".equals(event.getName())) {
            logger.log(Level.INFO, "Session attribute added - inputString: {0}", event.getValue());
        }
    }
    
    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        if ("inputString".equals(event.getName())) {
            logger.log(Level.INFO, "Session attribute removed - inputString: {0}", event.getValue());
        }
    }
    
    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        if ("inputString".equals(event.getName())) {
            logger.log(Level.INFO, "Session attribute replaced - inputString: {0}", event.getValue());
        }
    }
} 
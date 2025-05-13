package listener;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class SessionAttributeLogger implements HttpSessionAttributeListener {

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        if ("inputString".equals(event.getName())) {
            System.out.println("[LOG] Added: inputString = " + event.getValue());
        }
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        if ("inputString".equals(event.getName())) {
            System.out.println("[LOG] Replaced: inputString = " + event.getValue());
        }
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {}
}

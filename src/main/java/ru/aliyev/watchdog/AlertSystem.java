package ru.aliyev.watchdog;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class AlertSystem {

    @EventListener
    public void handleServerDown(ServerDownEvent event) {
        System.err.println("[ALERT] Attention! Exist mistake in server: " + event.getServerName());
        System.err.println("[ALERT] Sending notifications to administration...");
    }
}

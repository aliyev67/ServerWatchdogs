package ru.aliyev.watchdog;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class HealthReport {

    private String serverName;
    private String status;

    public HealthReport() {
        System.out.println("Initializing Health Report...");
    }

    @PostConstruct
    public void init() {
        System.out.println("Report ready to initialize");
    }

    public void setDetails(String serverName, String status) {
        this.serverName = serverName;
        this.status = status;
    }

    @Override
    public String toString() {
        return "HealthReport{server='" + serverName + "', status='" + status + "'}";
    }
}

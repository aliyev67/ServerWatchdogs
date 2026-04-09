package ru.aliyev.watchdog;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevMonitoringService implements MonitoringService {


    @Value("${app.monitoring.default-status:OK}")
    private String defaultStatus;


    @Override
    public void checkServer(String url) {
        System.out.println("[Dev Mode] Immitation checking: " + url);
        System.out.println("[Dev Mode] Result from config: " + defaultStatus);
    }
}

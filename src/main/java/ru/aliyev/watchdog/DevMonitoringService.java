package ru.aliyev.watchdog;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevMonitoringService implements MonitoringService {


    @Value("${app.monitoring.default-status:OK}")
    private String defaultStatus;

    private final ApplicationEventPublisher eventPublisher;

    public DevMonitoringService(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    @Override
    public void checkServer(String url) {
        System.out.println("[Dev Mode] Immitation checking: " + url);
        if (url.contains("error")) {
            eventPublisher.publishEvent(new ServerDownEvent(url));
        } else {
            System.out.println("[Dev Mode] Сервер работает в режиме: " + defaultStatus);
        }
    }
}

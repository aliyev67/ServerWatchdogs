package ru.aliyev.watchdog;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {
        System.setProperty("spring.profiles.active", "dev");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MonitoringService monitoringService = context.getBean(MonitoringService.class);
        monitoringService.checkServer("https://sdu.edu.kz");
        context.close();
    }
}

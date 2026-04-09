package ru.aliyev.watchdog;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {
        System.setProperty("spring.profiles.active", "dev");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MonitoringService monitoringService1= context.getBean(MonitoringService.class);
        monitoringService1.checkServer("https://sdu.edu.kz");

        MonitoringService monitoringService2 = context.getBean(MonitoringService.class);
        monitoringService2.checkServer("https://web.with.error.ru");

        context.close();
    }
}

package ru.aliyev.watchdog;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HealthReport report1 = context.getBean(HealthReport.class);
        report1.setDetails("Main-Server", "UP");

        HealthReport report2 = context.getBean(HealthReport.class);
        report2.setDetails("Database-Server", "DOWN");

        System.out.println(report1);
        System.out.println(report2);
        context.close();
    }
}

package ru.aliyev.watchdog;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("ru.aliyev.watchdog")
@EnableAspectJAutoProxy
public class AppConfig {
}

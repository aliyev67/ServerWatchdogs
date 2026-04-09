package ru.aliyev.watchdog;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceAspect {

    @Around("execution(* ru.aliyev.watchdog.MonitoringService.checkServer(..))")
    public Object measureExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object result = joinPoint.proceed();

        long executionTime = System.currentTimeMillis() - start;

        System.out.println("[AOP] >>> Method " + joinPoint.getSignature().getName() +
                " execute in " + executionTime + " ms");

        return result;
    }
}

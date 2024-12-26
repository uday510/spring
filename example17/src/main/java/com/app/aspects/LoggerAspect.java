package com.app.aspects;

import com.app.services.VehicleService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Aspect
@Component
@Order(2)
public class LoggerAspect {

    private final Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    @Around("execution(* com.app.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info(joinPoint.getSignature().toString() + " method execution start");
        Instant start = Instant.now();
        joinPoint.proceed();
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : " + timeElapsed);
        logger.info(joinPoint.getSignature().toString() + " method execution end");
    }

    @AfterThrowing(value = "execution(* com.app.services.*.*(..))", throwing = "ex")
    public void logAfterThrowing(ProceedingJoinPoint joinPoint, Throwable ex) {
        logger.severe("Exception in method : " + joinPoint.getSignature().toString());
        logger.severe("Exception is : " + ex);
    }

    @AfterReturning(value = "execution(* com.app.services.*.*(..))", returning = "result")
    public void logAfterReturning(ProceedingJoinPoint joinPoint, Object result) {
        logger.info("Method : " + joinPoint.getSignature().toString() + " returned : " + result);
    }

}

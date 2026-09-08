package aspects.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect                // You can either use @Component or @Bean I used @bean
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* aspects.service.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Method will execute");
        joinPoint.proceed();
        logger.info("Method executed");
    }
}

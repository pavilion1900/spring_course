package ru.clevertec.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* get*())")
    private void allGetMethods() {
    }

    @Before("allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: try to get a book / magazine");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: check to get a book / magazine");
    }
}

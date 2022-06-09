package ru.clevertec.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice try");
        Object result = null;
        try {
            result = proceedingJoinPoint.proceed();

        } catch (Exception e) {
            System.out.println("exception " + e);
            throw e;
        }
        System.out.println("aroundReturnBookLoggingAdvice success");
        return result;
    }
}

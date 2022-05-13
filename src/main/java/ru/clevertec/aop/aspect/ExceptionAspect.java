package ru.clevertec.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionAspect {
    @Before("ru.clevertec.aop.aspect.MyPointcuts.allGetMethods()")
    public void beforeGetExceptionAdvice() {
        System.out.println("beforeGetExceptionAdvice: catch exception");
    }
}

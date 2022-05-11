package ru.clevertec.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Library library = context.getBean("myLibrary", Library.class);
        library.getBook();
        context.close();
    }
}

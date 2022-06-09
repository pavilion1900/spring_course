package ru.clevertec.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("main starts");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
        String book = library.returnBook();
        System.out.println(book);
        context.close();
        System.out.println("main ends");
    }
}

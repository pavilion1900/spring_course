package ru.clevertec.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
//        uniLibrary.getBook();
        uniLibrary.returnBook();
//        uniLibrary.getMagazine();
//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();
        context.close();
    }
}

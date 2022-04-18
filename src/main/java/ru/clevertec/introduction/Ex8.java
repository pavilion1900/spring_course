package ru.clevertec.introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex8 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
//        Pet firstCat = context.getBean("catBean", Pet.class);
//        Pet secondCat = context.getBean("catBean", Pet.class);
        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
//        Person person2 = context.getBean("personBean", Person.class);
//        person.callYourPet();
//        System.out.println(person == person2);
        context.close();
    }
}

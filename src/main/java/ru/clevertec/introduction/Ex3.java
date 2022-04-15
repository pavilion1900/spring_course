package ru.clevertec.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        context.close();
    }
}

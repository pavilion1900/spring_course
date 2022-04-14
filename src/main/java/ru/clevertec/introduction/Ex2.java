package ru.clevertec.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();
        context.close();
    }
}

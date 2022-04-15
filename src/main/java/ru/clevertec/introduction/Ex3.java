package ru.clevertec.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet pet = new Cat();
        Pet pet = context.getBean("myPet", Pet.class);
        Person person = new Person(pet);
        person.callYourPet();
        context.close();
    }
}

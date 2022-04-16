package ru.clevertec.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog firstDog = context.getBean("myPet", Dog.class);
        firstDog.say();
        Dog secondDog = context.getBean("myPet", Dog.class);
        secondDog.say();
        context.close();
    }
}

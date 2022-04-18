package ru.clevertec.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex7 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Dog firstDog = context.getBean("dog", Dog.class);
        firstDog.say();
//        Dog secondDog = context.getBean("dog", Dog.class);
//        System.out.println(firstDog == secondDog);
        context.close();
    }
}

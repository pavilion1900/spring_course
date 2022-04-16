package ru.clevertec.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog firstDog = context.getBean("myPet", Dog.class);
        firstDog.setName("Belka");
        Dog secondDog = context.getBean("myPet", Dog.class);
        secondDog.setName("Strelka");
        System.out.println(firstDog.getName());
        System.out.println(secondDog.getName());
//        System.out.println(firstDog == secondDog);
//        System.out.println(firstDog);
//        System.out.println(secondDog);
        context.close();
    }
}

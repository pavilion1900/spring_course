package ru.clevertec.introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("ru.clevertec.introduction")
public class MyConfig {
    @Bean
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}

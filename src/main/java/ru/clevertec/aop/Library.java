package ru.clevertec.aop;

import org.springframework.stereotype.Component;

@Component("myLibrary")
public class Library {
    public void getBook() {
        System.out.println("We take a book");
    }
}

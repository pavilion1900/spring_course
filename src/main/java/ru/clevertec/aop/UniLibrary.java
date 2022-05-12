package ru.clevertec.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("We take a book from UniLibrary");
    }

    public void returnBook() {
        System.out.println("We return a book to UniLibrary");
    }

    public void getMagazine() {
        System.out.println("We take a magazine from UniLibrary");
    }

    public void returnMagazine() {
        System.out.println("We return a magazine to UniLibrary");
    }

    public void addBook() {
        System.out.println("We add a book to UniLibrary");
    }

    public void addMagazine() {
        System.out.println("We add a magazine to UniLibrary");
    }
}

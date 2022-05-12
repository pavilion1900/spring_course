package ru.clevertec.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    public void getBook(Book book) {
        System.out.println("We take a book from UniLibrary " + book.getName());
    }

//    public void returnBook() {
//        System.out.println("We return book to UniLibrary");
//    }

    public void getMagazine() {
        System.out.println("We take a magazine from UniLibrary");
    }
}

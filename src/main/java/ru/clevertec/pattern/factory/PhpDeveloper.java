package ru.clevertec.pattern.factory;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("php code");
    }
}

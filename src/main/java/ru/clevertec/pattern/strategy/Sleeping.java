package ru.clevertec.pattern.strategy;

public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("sleeping ....");
    }
}

package com.example.bookstudy.testdrivendevelopment.chapter1;

public class Dollar {

    int amount;
    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}

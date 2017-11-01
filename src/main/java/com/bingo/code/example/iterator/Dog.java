package com.bingo.code.example.iterator;

public class Dog {
    private int id;

    public Dog(int id) {
        super();
        this.id = id;
    }

    @Override
    public String toString() {
        return "Dog" + id;
    }
}
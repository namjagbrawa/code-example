package com.bingo.code.example.iterator;

public interface Collection<E> {
    void add(E e);
    int size();
    Iterator iterator();
}
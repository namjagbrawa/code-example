package com.bingo.code.example.iterator;

public class CollectionTest {

    public static void main(String[] args) {
        Collection co = new LinkedList();
        for (int i = 0; i < 15; i++) {
            co.add(new Dog(i));
        }
        System.out.println(co.size());

        Iterator it = co.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
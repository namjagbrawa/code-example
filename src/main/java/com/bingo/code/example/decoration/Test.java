package com.bingo.code.example.decoration;

public class Test {
    public static void main(String[] args) {

        //A公司
        Carpenter carpenterA = new Carpenter();
        Plumber plumberA = new Plumber();

        AWorker aWorker1 = new AWorker(carpenterA);
        AWorker aWorker2 = new AWorker(plumberA);

        aWorker1.doSomething();
        aWorker2.doSomething();

        System.out.println("==================================");

        //B公司
        Carpenter carpenterB = new Carpenter();
        Plumber plumberB = new Plumber();

        BWorker bWorker1 = new BWorker(carpenterB);
        BWorker bWorker2 = new BWorker(plumberB);

        bWorker1.doSomething();
        bWorker2.doSomething();
    }
}
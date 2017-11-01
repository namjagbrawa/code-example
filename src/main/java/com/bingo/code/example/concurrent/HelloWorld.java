package com.bingo.code.example.concurrent;

/**
 * Created by ZhangGe on 2017/9/19.
 */
public class HelloWorld {

    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread() {
            public void run() {
                System.out.println(
                        "Hello from new thread");
            }
        };
        myThread.start();
        Thread.yield();
        System.out.println("Hello from main thread");
        myThread.join(); // 确保myThread先执行完,
    }
}

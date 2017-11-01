package com.bingo.code.example.concurrent;

/**
 * Created by ZhangGe on 2017/9/19.
 */
public class Counting1 {
    public static void main(String[] args) throws InterruptedException {
        class Counter {
            private int count = 0;
            public synchronized void increment() {
                ++count;
            }
            public synchronized int getCount() {
                return count;
            }
        }

        final Counter counter = new Counter();
        class CountingThread extends Thread {
            public void run() {
                for (int i = 0; i< 100000; ++i) {
                    counter.increment();;
                }
            }
        }

        CountingThread t1 = new CountingThread();
        CountingThread t2 = new CountingThread();
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println(counter.getCount());

    }
}

package com.bingo.code.example.concurrent;

import java.util.Random;

/**
 * Created by ZhangGe on 2017/9/19.
 */
class Philosopher2 extends Thread {
    private Chopstick first, second;
    private Random random;

    public Philosopher2(Chopstick left, Chopstick right) {
        if (left.id < right.id) {
            this.first = left;
            this.second = right;
        } else {
            this.second = left;
            this.first = right;
        }
        random = new Random();
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(random.nextInt(1000));
                synchronized (first) {
                    synchronized (second) {
                        Thread.sleep(random.nextInt(1000));
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Philosopher2 philosopher = new Philosopher2(new Chopstick(), new Chopstick());
        philosopher.start();
        philosopher.join();
    }
}

class Chopstick {
    public int id;
}

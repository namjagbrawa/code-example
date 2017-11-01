package com.bingo.code.example.redis;

import redis.clients.jedis.Jedis;

/**
 * Created by ZhangGe on 2017/10/12.
 */
public class IdGen {
    public static void main(String[] args) throws InterruptedException {

        int count = 0;

        for (int i = 0; i < 150; i++) {
            final int b = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Jedis jedis = new Jedis("192.168.223.24", 6379);
                    for (int j = 0;j< 10000;j++) {
                        Long abc = jedis.incr("g1234");
                        if (j % 1000 == 0 ) {
                            System.out.println("the " + b + " " + abc);
                        }
                    }
                }
            }).start();

        }

        Thread.sleep(60000);

        Jedis jedis1 = new Jedis("192.168.223.24", 6379);
        System.err.println(jedis1.incr("g1234"));
        Thread.sleep(100000);

    }
}

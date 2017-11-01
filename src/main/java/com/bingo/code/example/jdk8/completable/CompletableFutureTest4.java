package com.bingo.code.example.jdk8.completable;

import java.util.concurrent.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by ZhangGe on 2017/8/31.
 */
public class CompletableFutureTest4 {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(5);

        CompletableFuture<String> resultCompletableFuture = CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                return "hello";
            }
        }, executor);
        resultCompletableFuture.thenAcceptAsync(new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
                System.out.println(Thread.currentThread().getName());
            }
        }, executor);

        TimeUnit.SECONDS.sleep(3);

        executor.shutdown();
    }
}

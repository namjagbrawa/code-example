package com.bingo.code.example.jdk8.completable;

import sun.util.locale.provider.TimeZoneNameUtility;

import java.util.concurrent.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by ZhangGe on 2017/8/31.
 */
public class CompletableFutureTest3 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(5);

        CompletableFuture<String> resultCompletableFuture = CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "hello";
            }
        }, executor);
        System.out.println(resultCompletableFuture.thenAccept(new Consumer<String>(){
            @Override
            public void accept(String t) {
                System.out.println(t);
                System.out.println(Thread.currentThread().getName());
            }
        }));

        TimeUnit.SECONDS.sleep(3);

        executor.shutdown();
    }
}



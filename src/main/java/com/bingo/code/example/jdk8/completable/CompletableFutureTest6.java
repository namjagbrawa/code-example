package com.bingo.code.example.jdk8.completable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by ZhangGe on 2017/8/31.
 */
public class CompletableFutureTest6 {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(5);

        CompletableFuture<String> resultCompletableFuture = CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                try {
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("run--" + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "hello";
            }
        }, executor);
        resultCompletableFuture.thenAccept(new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println("accept--" + t);
                System.out.println(Thread.currentThread().getName());
            }
        }).exceptionally(new Function<Throwable, Void>(){
            @Override
            public Void apply(Throwable t) {
                System.out.println(t.getMessage());
                return null;
            }
        });
        resultCompletableFuture.completeExceptionally(new Exception("error"));
        System.out.println("over");

        TimeUnit.SECONDS.sleep(10);

        executor.shutdown();
    }
}

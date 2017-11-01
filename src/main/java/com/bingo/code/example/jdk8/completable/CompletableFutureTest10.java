package com.bingo.code.example.jdk8.completable;

import java.util.concurrent.*;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by ZhangGe on 2017/8/31.
 */
public class CompletableFutureTest10 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(5);

        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("zero");
            System.out.println(Thread.currentThread().getName());
            return "zero";
        }, executor);

        CompletableFuture<Integer> f2 = f1.thenApply(new Function<String, Integer>() {

            @Override
            public Integer apply(String t) {
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(2);
                System.out.println(2 + t);
                System.out.println(Thread.currentThread().getName());
                return Integer.valueOf(t.length());
            }
        });


        CompletableFuture<Double> future = f2.thenApply(r -> r * 2.0);

        future.handle(new BiFunction<Double, Throwable, Double>() {
            @Override
            public Double apply(Double t, Throwable u) {
                if (t != null) {
                    System.out.println("handler");
                    return t;
                } else {
                    System.out.println(u);
                    return -1.0;
                }
            }
        });

        System.out.println(future.get());

        executor.shutdown();
    }
}

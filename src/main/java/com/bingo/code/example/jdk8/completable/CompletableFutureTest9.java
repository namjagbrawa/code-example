package com.bingo.code.example.jdk8.completable;

import java.util.concurrent.*;
import java.util.function.Function;

/**
 * Created by ZhangGe on 2017/8/31.
 */
public class CompletableFutureTest9 {

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

        CompletableFuture<Integer> f2 = f1.thenApplyAsync(new Function<String, Integer>() {

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
        }, executor);

        CompletableFuture<Double> f3 = f2.thenApplyAsync(r -> r * 2.0);

        System.out.println(f3.get());

        executor.shutdown();
    }
}

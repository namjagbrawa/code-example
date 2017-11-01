package com.bingo.code.example.jdk8.completable;

import java.util.concurrent.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by ZhangGe on 2017/8/31.
 */
public class CompletableFutureTest11 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(5);
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return "zero";
        }, executor);
        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return "hello";
        }, executor);

        CompletableFuture<Void> reslutFuture = f1.thenAcceptBoth(f2, new BiConsumer<String, String>() {
            @Override
            public void accept(String t, String u) {
                System.out.println(t + " over");
                System.out.println(u + " over");
            }
        });

        System.out.println(reslutFuture.get());

        executor.shutdown();
    }
}

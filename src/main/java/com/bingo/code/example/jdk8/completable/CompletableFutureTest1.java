package com.bingo.code.example.jdk8.completable;

import java.util.concurrent.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by ZhangGe on 2017/8/31.
 */
public class CompletableFutureTest1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(5);

        Future<String> result = executor.submit(() -> {
            TimeUnit.SECONDS.sleep(3);
            return "hello";
        });
        System.out.println(result.get());

        executor.shutdown();
    }
}



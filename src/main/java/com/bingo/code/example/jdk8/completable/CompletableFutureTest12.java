package com.bingo.code.example.jdk8.completable;

import java.time.Duration;
import java.util.concurrent.*;

/**
 * Created by ZhangGe on 2017/8/31.
 */
public class CompletableFutureTest12 {

    public static void main(String[] args) throws InterruptedException {
        CompletableFuture<String> responseFuture = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("over");
            return "hello world!";
        });

        failAfter(Duration.ofSeconds(2)).acceptEither(responseFuture, (x) -> {
            System.out.println("responseFuture is over successed! the response is " + x);

        }).exceptionally(throwable -> { //exceptionally必须在最后
            System.out.println("responseFuture is not over on time!");
            return null;
        });

        TimeUnit.SECONDS.sleep(10);
        scheduler.shutdown();

    }

    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public static <T> CompletableFuture<T> failAfter(Duration duration) throws InterruptedException {
        final CompletableFuture<T> promise = new CompletableFuture<>();
        scheduler.schedule(() -> {
            final TimeoutException ex = new TimeoutException("Timeout after " + duration);
            return promise.completeExceptionally(ex);
        }, duration.toMillis(), TimeUnit.MILLISECONDS);

        return promise;
    }

}

package com.bingo.code.example.guava.tick;

import com.google.common.base.Ticker;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.concurrent.TimeUnit;

public class Demo {

    public static void main(String[] args) {
        // 自定义ticker  
        TestTicker testTicker = new TestTicker();

        // 创建缓存,1小时没有访问则过期  
        Cache<String, byte[]> cache = CacheBuilder.newBuilder().ticker(testTicker).expireAfterAccess(1, TimeUnit.HOURS).build();
        cache.put("id", new byte[1024 * 1024]);

        // 模拟时间流逝  
        testTicker.addElapsedTime(TimeUnit.NANOSECONDS.convert(1, TimeUnit.HOURS));

        System.out.println(cache.getIfPresent("id") == null);//true  
    }

    private static class TestTicker extends Ticker {
        private long start = Ticker.systemTicker().read();
        private long elapsedNano = 0;

        @Override
        public long read() {
            return start + elapsedNano;
        }

        public void addElapsedTime(long elapsedNano) {
            this.elapsedNano = elapsedNano;
        }
    }

}  
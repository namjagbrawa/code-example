package com.bingo.code.example.concurrent;

import java.util.concurrent.atomic.LongAdder;

/**
 * Created by ZhangGe on 2017/9/20.
 */
public class LongAdderDemo {
    public static void main(String[] args) {
        LongAdder longAdder = new LongAdder();
        // count++操作如果是JDK8，推荐使用LongAdder对象，比AtomicLong性能更好（减少乐观锁的重试次数）。
    }
}

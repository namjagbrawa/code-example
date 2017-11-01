package com.bingo.code.example.oom;

/**
 * Created by ZhangGe on 2017/9/22.
 */
public class StackOutOfMemoryStackOverFlow {
    public static void main(String[] args) throws Exception{
        new StackOutOfMemoryStackOverFlow().run();
    }

    public void run(){
        long time = System.currentTimeMillis();
        run();
    }
}

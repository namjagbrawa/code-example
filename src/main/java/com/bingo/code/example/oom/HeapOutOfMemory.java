package com.bingo.code.example.oom;

import java.util.ArrayList;

/**
 * Created by ZhangGe on 2017/9/22.
 */
public class HeapOutOfMemory {
    public static void main(String[] args) throws Exception{
        for (int i = 0; i < 10;i++) {
            new Thread(new Run()).start();
        }
    }


}

class Run implements Runnable {
    @Override
    public void run() {
        ArrayList<String> strs = new ArrayList<>(10000_0000);
        for(int i = 0 ;i <= 10000_0000; ++ i){
            strs.add(Integer.toString(i));
            if(i % 10000 == 0){
                System.out.println(i);
            }
        }
    }
}

package com.bingo.code.example.oom;

import com.bingo.code.example.iterator.ArrayList;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ZhangGe on 2017/9/22.
 */
public class A {
    private final static Map<Integer, ArrayList<Object>> a= new HashMap();
    public static void main(String[] args) {
        while(true) {
            ArrayList<Object> objectArrayList = new ArrayList<>();
            int i = 0;
            a.put(i++, objectArrayList);
        }
    }
}

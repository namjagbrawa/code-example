package com.bingo.code.example.iterator;

import java.util.*;

/**
 * Created by ZhangGe on 2017/9/20.
 */
public class RemoveCollection {
    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<String>();
        java.util.Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String temp = it.next();
            if (true) {
                it.remove();
            }
        }
    }
}

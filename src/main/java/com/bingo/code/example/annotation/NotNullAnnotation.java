package com.bingo.code.example.annotation;

import com.sun.istack.internal.Nullable;

/**
 * Created by ZhangGe on 2017/8/30.
 */
public class NotNullAnnotation {

    public String get(@Nullable String str) {
        return str;
    }

    public static void main(String[] args) {
        NotNullAnnotation notNullAnnotation = new NotNullAnnotation();
        String abc = notNullAnnotation.get(null);
        System.out.println(abc);
    }
}

package com.bingo.code.example.jdk8.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        java7_biFunction();
        java8_biFunction();
    }

    private static void java7_biFunction() {
        Function<String, String> func = new Function<String, String>() {
            @Override
            public String apply(String t) {
                return t + "-then";
            }
        };
        BiFunction<String, String, String> bi = new BiFunction<String, String, String>() {
            @Override
            public String apply(String t, String u) {
                return t + u;
            }
        };
        System.out.println(func.apply("test"));//test-then
        System.out.println(bi.apply("java2s.com", "-tutorial"));//java2s.com-tutorial
        System.out.println(bi.andThen(func).andThen(func).apply("java2s.com", "-tutorial"));//java2s.com-tutorial-then-then
    }

    private static void java8_biFunction() {
        //java8新特性，lambda表达式
        BiFunction<String, String, String> bi = (x, y) -> {
            return x + y;
        };
        Function<String, String> func = x -> x + "-then";
        System.out.println(func.apply("test"));//test-then
        System.out.println(bi.apply("java2s.com", "-tutorial"));//java2s.com tutorial
        System.out.println(bi.andThen(func).andThen(func).apply("java2s.com", "-tutorial"));//java2s.com-tutorial-then-then
    }
}
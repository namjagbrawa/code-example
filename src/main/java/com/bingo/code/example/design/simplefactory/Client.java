package com.bingo.code.example.design.simplefactory;

public class Client {
    public static void main(String[] args) {
        Api api = Factory.createApi();
        api.operation("哈哈，不要紧张，只是个测试而已！");
    }
}
package com.bingo.code.example.test;

/**
 * Created by ZhangGe on 2017/9/20.
 */
public class Split {
    public static void main(String[] args) {
        //预期大于3，结果是3
        String demo = "a,b,c,,";
        System.out.println(demo.split(",").length);
        String[] split = demo.split(",");
        for (int i = 0 ;i < split.length;++i) {
            System.out.println(split[i]);
        }
    }
}

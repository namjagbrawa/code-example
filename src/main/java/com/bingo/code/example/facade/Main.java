package com.bingo.code.example.facade;

public class Main {

    public static void main(String[] args){
        Light light1 = new Light();
        Light light2 = new Light();
        Light light3 = new Light();
        Heater heater = new Heater();
        TV tv = new TV();

        /**
         * 需要一步一步的操作
         */
        light1.open();
        light2.open();
        light3.open();
        heater.open();
        tv.open();
    }
}
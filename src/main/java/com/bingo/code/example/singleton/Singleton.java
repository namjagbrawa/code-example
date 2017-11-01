package com.bingo.code.example.singleton;
  
public class Singleton {  
    private static volatile Singleton instance;
  
    private Singleton() {  
    }  
  
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

class Singleton1 {
    private static class InstanceHolder {
        public static Singleton1 instance = new Singleton1();
    }

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return InstanceHolder.instance;
    }
}

class Singleton2 {
    private static Singleton2 instance = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return instance;
    }
}
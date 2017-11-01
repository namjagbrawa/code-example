package com.bingo.code.example.classloader;

public class NetClassLoaderSimple {

    private NetClassLoaderSimple instance;

    public void setNetClassLoaderSimple(Object obj) {
        this.instance = (NetClassLoaderSimple) obj;
    }

    public static void main(String[] args) {
        ClassLoader loader = NetClassLoaderSimple.class.getClassLoader();    //获得加载ClassLoaderTest.class这个类的类加载器
        while(loader != null) {
            System.out.println(loader);
            loader = loader.getParent();    //获得父类加载器的引用
        }
        System.out.println(loader);
    }
}  
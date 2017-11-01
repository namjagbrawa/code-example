package com.bingo.code.example.design.facade.facadeexample;

public class Facade {
    public void test() {
        //���ڲ�ʵ�ֵ�ʱ�򣬿��ܻ���õ��ڲ��Ķ��ģ��
        AModuleApi a = new AModuleImpl();
        a.testA();
        BModuleApi b = new BModuleImpl();
        b.testB();
        CModuleApi c = new CModuleImpl();
        c.testC();
    }
}

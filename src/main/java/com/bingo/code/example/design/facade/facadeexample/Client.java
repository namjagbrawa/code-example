package com.bingo.code.example.design.facade.facadeexample;

public class Client {
	public static void main(String[] args) {
//		//����Facade����Ҫ�Լ������ģ�齻��
//		AModuleApi a = new AModuleImpl();
//		a.testA();
//		BModuleApi b = new BModuleImpl();
//		b.testB();
//		CModuleApi c = new CModuleImpl();
//		c.testC();
//		
//		System.out.println("ʹ��Facade----------------------��");
		//ʹ����Facade
		new Facade().test();		
	}
}

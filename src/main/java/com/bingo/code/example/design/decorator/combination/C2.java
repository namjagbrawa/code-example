package com.bingo.code.example.design.decorator.combination;

public class C2 {
	/**
	 * ����A�����ʵ��
	 */
	private A a = new A();

	public void a1(){
		//ת��A����Ĺ���
		a.a1();
	}
	public void c11(){
		System.out.println("now in C2.c11");
	}
}

package com.bingo.code.example.design.decorator.combination;

public class C3 {
	private A a = new A();
	private B b = new B();

	public void a1(){
		//ת��A����Ĺ���
		a.a1();
	}
	public void b1(){
		//ת��B����Ĺ���
		b.b1();
	}

	public void c11(){
		System.out.println("now in C3.c11");
	}
}

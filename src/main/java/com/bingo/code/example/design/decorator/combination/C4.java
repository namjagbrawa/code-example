package com.bingo.code.example.design.decorator.combination;

public class C4 {
	//ʾ��ֱ���������ϴ�����Ҫ��ϵĶ���
	private A a = new A();
	//ʾ��ͨ���ⲿ������Ҫ��ϵĶ���
	private B b = null;
	public void setB(B b){
		this.b = b;
	}
	public void a1(){
		//ת��A����Ĺ���
		a.a1();
	}
	public void b1(){
		//ת��B����Ĺ���
		b.b1();
	}
	public void c11(){
		System.out.println("now in C4.c11");
	}
}

package com.bingo.code.example.design.chainofresponsibility.unified;

public class Client {
	public static void main(String[] args) {
		//��Ҫ��װְ����		
		Handler h1 = new GeneralManager();
		Handler h2 = new DepManager();
		Handler h3 = new ProjectManager();
		h3.setSuccessor(h2);
		h2.setSuccessor(h1);
		
		//��ʼ��������۲ͷ���
		String ret1 = h3.handleFeeRequest("С��", 300);
		System.out.println("the ret1="+ret1);
		String ret2 = h3.handleFeeRequest("С��", 600);
		System.out.println("the ret2="+ret2);
		String ret3 = h3.handleFeeRequest("С��", 1200);
		System.out.println("the ret3="+ret3);
		
		//��ʼ����������÷���
		h3.handlePreFeeRequest("С��", 3000);
		h3.handlePreFeeRequest("С��", 6000);
		h3.handlePreFeeRequest("С��", 32000);
	}
}

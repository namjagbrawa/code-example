package com.bingo.code.example.design.chainofresponsibility.module;
/**
 * ְ�����Ŀͻ��ˣ�����ֻ�Ǹ�ʾ��
 */
public class Client {
	public static void main(String[] args) {
		//��Ҫ��װְ����
		Handler h1 = new ConcreteHandler1();
		Handler h2 = new ConcreteHandler2();
		
		h1.setSuccessor(h2);		
		//Ȼ���ύ����
		h1.handleRequest();
	}
}

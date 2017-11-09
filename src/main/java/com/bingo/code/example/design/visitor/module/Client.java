package com.bingo.code.example.design.visitor.module;

public class Client {
	public static void main(String[] args) {
		//����ObjectStructure
		ObjectStructure os = new ObjectStructure();
		//����Ҫ�������ṹ��Ԫ��
		Element eleA = new ConcreteElementA();
		Element eleB = new ConcreteElementB();
		//��Ԫ�ؼ������ṹ
		os.addElement(eleA);
		os.addElement(eleB);
		
		//����������
		Visitor visitor = new ConcreteVisitor1();
		
		//����ҵ����ķ���
		os.handleRequest(visitor);		
	}
}

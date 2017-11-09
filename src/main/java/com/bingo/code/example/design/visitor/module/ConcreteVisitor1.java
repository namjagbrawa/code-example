package com.bingo.code.example.design.visitor.module;
/**
 * ����ķ�����ʵ��
 */
public class ConcreteVisitor1 implements Visitor {
	public void visitConcreteElementA(ConcreteElementA element) {
		//��ȥ����ConcreteElementAʱ����Ҫִ�еĹ���ʵ��������
		//������Ҫ����Ԫ�����еĹ��ܣ����磺
		element.opertionA();
	}
	public void visitConcreteElementB(ConcreteElementB element) {
		//��ȥ����ConcreteElementBʱ����Ҫִ�еĹ���ʵ��������
		//������Ҫ����Ԫ�����еĹ��ܣ����磺
		element.opertionB();
	}
}
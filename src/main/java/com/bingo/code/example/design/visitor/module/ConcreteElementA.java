package com.bingo.code.example.design.visitor.module;
/**
 * ����Ԫ�ص�ʵ�ֶ���
 */
public class ConcreteElementA extends Element {
	public void accept(Visitor visitor) {
		//�ص������߶������Ӧ����
		visitor.visitConcreteElementA(this);
	}
	/**
	 * ʾ����������ʾԪ�����еĹ���ʵ��
	 */
	public void opertionA(){
		//���еĹ���ʵ��
	}
}


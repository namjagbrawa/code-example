package com.bingo.code.example.design.visitor.module;
/**
 * ����Ԫ�ص�ʵ�ֶ���
 */
public class ConcreteElementB extends Element {
	public void accept(Visitor visitor) {
		//�ص������߶������Ӧ����
		visitor.visitConcreteElementB(this);
	}
	/**
	 * ʾ����������ʾԪ�����еĹ���ʵ��
	 */
	public void opertionB(){
		//���еĹ���ʵ��
	}
}


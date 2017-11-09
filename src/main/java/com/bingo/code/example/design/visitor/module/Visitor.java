package com.bingo.code.example.design.visitor.module;
/**
 * �����߽ӿ�
 */
public interface Visitor {
	/**
	 * ����Ԫ��A���൱�ڸ�Ԫ��A��ӷ����ߵĹ���
	 * @param elementA Ԫ��A�Ķ���
	 */
	public void visitConcreteElementA(ConcreteElementA elementA);
	/**
	 * ����Ԫ��B���൱�ڸ�Ԫ��B��ӷ����ߵĹ���
	 * @param elementB Ԫ��B�Ķ���
	 */
	public void visitConcreteElementB(ConcreteElementB elementB);
}


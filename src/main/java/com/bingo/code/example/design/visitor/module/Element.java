package com.bingo.code.example.design.visitor.module;
/**
 * �����ʵ�Ԫ�صĽӿ�
 */
public abstract class Element {
	/**
	 * ���ܷ����ߵķ���
	 * @param visitor �����߶���
	 */
	public abstract void accept(Visitor visitor);
}


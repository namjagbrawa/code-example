package com.bingo.code.example.design.iterator.rewrite;

/**
 * �ۺ϶���Ľӿڣ����崴����Ӧ����������Ľӿ�
 */
public abstract class Aggregate {
	/**
	 * ����������������Ӧ����������Ľӿ�
	 * @return ��Ӧ����������Ľӿ�
	 */
	public abstract Iterator createIterator();
}
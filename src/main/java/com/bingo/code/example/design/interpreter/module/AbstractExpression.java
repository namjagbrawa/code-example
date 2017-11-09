package com.bingo.code.example.design.interpreter.module;

/**
 * ������ʽ
 */
public abstract class AbstractExpression {
	/**
	 * ���͵Ĳ���
	 * @param ctx �����Ķ���
	 */
	public abstract void interpret(Context ctx);
}

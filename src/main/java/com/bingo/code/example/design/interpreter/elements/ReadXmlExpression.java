package com.bingo.code.example.design.interpreter.elements;

/**
 * ���ڴ����Զ���Xmlȡֵ���ʽ�Ľӿ�
 */
public abstract class ReadXmlExpression {
	/**
	 * ���ͱ��ʽ
	 * @param c ������
	 * @return ���������ֵ��Ϊ��ͨ�ã������ǵ���ֵ��Ҳ�����Ƕ��ֵ��
	 *         ��˾ͷ���һ������
	 */
	public abstract String[] interpret(Context c);
}


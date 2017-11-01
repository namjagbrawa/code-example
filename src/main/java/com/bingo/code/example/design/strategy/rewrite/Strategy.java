package com.bingo.code.example.design.strategy.rewrite;

/**
 * ���ԣ�������㱨���㷨�Ľӿ�
 */
public interface Strategy {
	/**
	 * ����Ӧ���ļ۸�
	 * @param goodsPrice ��Ʒ����ԭ��
	 * @return ��������ģ�Ӧ�ø��ͻ����ļ۸�
	 */
	public double calcPrice(double goodsPrice);
}


package com.bingo.code.example.design.strategy.rewrite;
/**
 * �����㷨ʵ�֣�Ϊ�¿ͻ���������ͨ�ͻ�����Ӧ���ļ۸�
 */
public class NormalCustomerStrategy implements Strategy{
	public double calcPrice(double goodsPrice) {
		System.out.println("�����¿ͻ���������ͨ�ͻ���û���ۿ�");
		return goodsPrice;
	}
}

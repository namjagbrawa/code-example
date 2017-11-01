package com.bingo.code.example.design.strategy.rewrite;
/**
 * �����㷨ʵ�֣�Ϊս�Ժ����ͻ��ͻ�����Ӧ���ļ۸�
 */
public class CooperateCustomerStrategy implements Strategy{
	public double calcPrice(double goodsPrice) {
		System.out.println("����ս�Ժ����ͻ���ͳһ8��");
		return goodsPrice*0.8;
	}
}

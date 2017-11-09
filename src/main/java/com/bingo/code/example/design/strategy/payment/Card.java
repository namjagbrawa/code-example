package com.bingo.code.example.design.strategy.payment;
/**
 * ֧�������п�
 */
public class Card implements PaymentStrategy{
	
	public void pay(PaymentContext ctx) {
		//����µ��㷨�Լ�֪��Ҫʹ����չ��֧�������ģ�����ǿ������һ��
		PaymentContext2 ctx2 = (PaymentContext2)ctx;
		System.out.println("���ڸ�"+ctx2.getUserName()+"��"+ctx2.getAccount()+"�ʺ�֧����"+ctx2.getMoney()+"Ԫ");
		//�������У�����ת�ʣ��Ͳ�ȥ����
	}
}

package com.bingo.code.example.design.strategy.payment;
/**
 * ������ֽ�֧��
 */
public class RMBCash implements PaymentStrategy{
	
	public void pay(PaymentContext ctx) {
		System.out.println("���ڸ�"+ctx.getUserName()+"������ֽ�֧��"+ctx.getMoney()+"Ԫ");
	}

}

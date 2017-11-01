package com.bingo.code.example.design.strategy.newstrategy;
/**
 * ������ֽ�֧��
 */
public class RMBCash implements PaymentStrategy{
	
	public void pay(PaymentContext ctx) {
		System.out.println("���ڸ�"+ctx.getUserName()+"������ֽ�֧��"+ctx.getMoney()+"Ԫ");
	}

}

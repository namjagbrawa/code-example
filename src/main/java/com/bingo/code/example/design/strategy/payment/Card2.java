package com.bingo.code.example.design.strategy.payment;
/**
 * ֧�������п�
 */
public class Card2 implements PaymentStrategy{
	/**
	 * �ʺ���Ϣ
	 */
	private String account = "";
	/**
	 * ���췽���������ʺ���Ϣ
	 * @param account �ʺ���Ϣ
	 */
	public Card2(String account){
		this.account = account;
	}
	public void pay(PaymentContext ctx) {
		System.out.println("���ڸ�"+ctx.getUserName()+"��"+this.account+"�ʺ�֧����"+ctx.getMoney()+"Ԫ");
		//�������У�����ת�ʣ��Ͳ�ȥ����
	}
}

package com.bingo.code.example.design.strategy.payment;
/**
 * ��չ��֧�������Ķ���
 */
public class PaymentContext2 extends PaymentContext {
	/**
	 * �����ʺ�
	 */
	private String account = null;
	/**
	 * ���췽�������뱻֧�����ʵ���Ա��Ӧ֧���Ľ��;����֧������
	 * @param userName ��֧�����ʵ���Ա
	 * @param money Ӧ֧���Ľ��
	 * @param account ֧�����������ʺ�
	 * @param strategy �����֧������
	 */
	public PaymentContext2(String userName,double money,String account,PaymentStrategy strategy){
		super(userName,money,strategy);
		this.account = account;
	}
	public String getAccount() {
		return account;
	}
}

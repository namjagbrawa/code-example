package com.bingo.code.example.design.strategy.payment;
/**
 * ֧�����ʵ������ģ�ÿ���˵Ĺ��ʲ�ͬ��֧����ʽҲ��ͬ
 */
public class PaymentContext {
	/**
	 * Ӧ��֧�����ʵ���Ա���򵥵㣬������������
	 */
	private String userName = null;
	/**
	 * Ӧ��֧���Ĺ��ʵĽ��
	 */
	private double money = 0.0;
	/**
	 * ֧�����ʵķ�ʽ���ԵĽӿ�
	 */
	private PaymentStrategy strategy = null;
	/**
	 * ���췽�������뱻֧�����ʵ���Ա��Ӧ֧���Ľ��;����֧������
	 * @param userName ��֧�����ʵ���Ա
	 * @param money Ӧ֧���Ľ��
	 * @param strategy �����֧������
	 */
	public PaymentContext(String userName,double money,PaymentStrategy strategy){
		this.userName = userName;
		this.money = money;
		this.strategy = strategy;
	}

	/**
	 * ����֧������
	 */
	public void payNow(){
		//ʹ�ÿͻ�ϣ����֧��������֧������
		this.strategy.pay(this);
	}
	public String getUserName() {
		return userName;
	}

	public double getMoney() {
		return money;
	}
}

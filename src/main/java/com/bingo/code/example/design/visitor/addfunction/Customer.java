package com.bingo.code.example.design.visitor.addfunction;
/**
 * ���ֿͻ��ĸ���
 */
public abstract class Customer {
	/**
	 * �ͻ����
	 */
	private String customerId;
	/**
	 * �ͻ�����
	 */
	private String name;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	/**
	 * �ͻ������������ķ�����ʾ��һ��
	 */
	public abstract void serviceRequest();
	/**
	 * �ͻ��Թ�˾��Ʒ��ƫ�÷�����ʾ��һ��
	 */
	public abstract void predilectionAnalyze();
	/**
	 * �ͻ���ֵ������ʾ��һ��
	 */
	public abstract void worthAnalyze();
}

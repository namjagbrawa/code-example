package com.bingo.code.example.design.visitor.nodesign;
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
}

package com.bingo.code.example.design.visitor.nodesign;
/**
 * ���˿ͻ�
 */
public class PersonalCustomer extends Customer{
	/**
	 * ��ϵ�绰
	 */
	private String telephone;
	/**
	 * ����
	 */
	private int age;
	
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	/**
	 * ���˿ͻ������������ķ�����ʾ��һ��
	 */
	public void serviceRequest(){
		//���˿ͻ�����ľ����������
		System.out.println("�ͻ�"+this.getName()+"�����������");
	}
}
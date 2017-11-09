package com.bingo.code.example.design.visitor.nodesign;
/**
 * ��ҵ�ͻ�
 */
public class EnterpriseCustomer extends Customer{
	/**
	 * ��ϵ��
	 */
	private String linkman;
	/**
	 * ��ϵ�绰
	 */
	private String linkTelephone;
	/**
	 * ��ҵע���ַ
	 */
	private String registerAddress;
	
	
	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getLinkTelephone() {
		return linkTelephone;
	}

	public void setLinkTelephone(String linkTelephone) {
		this.linkTelephone = linkTelephone;
	}

	public String getRegisterAddress() {
		return registerAddress;
	}

	public void setRegisterAddress(String registerAddress) {
		this.registerAddress = registerAddress;
	}
	
	/**
	 * ��ҵ�ͻ������������ķ�����ʾ��һ��
	 */
	public void serviceRequest(){
		//��ҵ�ͻ�����ľ����������
		System.out.println(this.getName()+"��ҵ�����������");
	}
}

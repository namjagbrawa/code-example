package com.bingo.code.example.design.visitor.rewrite;


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
	
	public void accept(Visitor visitor) {
		//�ص������߶������Ӧ����
		visitor.visitEnterpriseCustomer(this);
	}
}

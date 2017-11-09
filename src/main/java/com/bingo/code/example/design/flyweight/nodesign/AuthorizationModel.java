package com.bingo.code.example.design.flyweight.nodesign;
/**
 * ������Ȩ���ݵ�����model
 */
public class AuthorizationModel {
	/**
	 * ��Ա
	 */
	private String user;
	/**
	 * ��ȫʵ��
	 */
	private String securityEntity;
	/**
	 * Ȩ��
	 */
	private String permit;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getSecurityEntity() {
		return securityEntity;
	}
	public void setSecurityEntity(String securityEntity) {
		this.securityEntity = securityEntity;
	}
	public String getPermit() {
		return permit;
	}
	public void setPermit(String permit) {
		this.permit = permit;
	}
	
}

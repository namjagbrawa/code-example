package com.bingo.code.example.design.flyweight.clearcache;

/**
 * ��װ��Ȩ�������ظ����ֲ��ֵ���Ԫ����
 */
public class AuthorizationFlyweight implements Flyweight{
	/**
	 * �ڲ�״̬����ȫʵ��
	 */
	private String securityEntity;
	/**
	 * �ڲ�״̬��Ȩ��
	 */
	private String permit;
	/**
	 * ���췽��������״̬����
	 * @param state ״̬���ݣ�������ȫʵ���Ȩ�޵����ݣ���","�ָ�
	 */
	public AuthorizationFlyweight(String state){
		String ss[] = state.split(",");
		securityEntity = ss[0];
		permit = ss[1];
	}
	
	public String getSecurityEntity() {
		return securityEntity;
	}
	public String getPermit() {
		return permit;
	}

	public boolean match(String securityEntity, String permit) {
		if(this.securityEntity.equals(securityEntity) 
				&& this.permit.equals(permit)){
			return true;
		}
		return false;
	}

	public void add(Flyweight f) {
		throw new UnsupportedOperationException("����֧���������");
	}
}

package com.bingo.code.example.design.flyweight.unshared;

/***
 * ������Ȩ���ݵ���Ԫ�ӿ�
 */
public interface Flyweight {
	/**
	 * �жϴ���İ�ȫʵ���Ȩ�ޣ��Ƿ����Ԫ�����ڲ�״̬ƥ��
	 * @param securityEntity ��ȫʵ��
	 * @param permit Ȩ��
	 * @return true��ʾƥ�䣬false��ʾ��ƥ��
	 */
	public boolean match(String securityEntity, String permit);
	/**
	 * Ϊflyweight�����flyweight����
	 * @param f ����ӵ���flyweight����
	 */
	public void add(Flyweight f);	
}
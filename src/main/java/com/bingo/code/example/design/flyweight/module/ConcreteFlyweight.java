package com.bingo.code.example.design.flyweight.module;
/**
 * ��Ԫ����
 */
public class ConcreteFlyweight implements Flyweight{
	/**
	 * ʾ���������ڲ�״̬
	 */
	private String intrinsicState;
	/**
	 * ���췽����������Ԫ������ڲ�״̬������
	 * @param state ��Ԫ������ڲ�״̬������
	 */
	public ConcreteFlyweight(String state){
		this.intrinsicState = state;
	}
	public void operation(String extrinsicState) {
		//����Ĺ��ܴ������ܻ��õ���Ԫ�ڲ����ⲿ��״̬
	}	
}

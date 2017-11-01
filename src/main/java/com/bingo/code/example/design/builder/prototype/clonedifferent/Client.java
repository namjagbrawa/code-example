package com.bingo.code.example.design.builder.prototype.clonedifferent;

public class Client {
	public static void main(String[] args) {
		//�ȴ���ԭ��ʵ��
		OrderApi oa1 = new PersonalOrder();
		
		//����ԭ��ʵ���Ķ���������ֵ
		oa1.setOrderProductNum(100);
		//Ϊ�˼򵥣���������������
	    System.out.println("���ǵ�һ�λ�ȡ�Ķ���ʵ��==="+oa1.getOrderProductNum());
	    
		//ͨ����¡����ȡ�µ�ʵ��
	    OrderApi oa2 = (OrderApi)oa1.cloneOrder();
		//�޸���������
		oa2.setOrderProductNum(80);
		//�����¡�����Ķ����ֵ
		System.out.println("�����¡������ʵ��==="+oa2.getOrderProductNum());
		
		//�ٴ����ԭ��ʵ����ֵ
		System.out.println("�ٴ����ԭ��ʵ��==="+oa1.getOrderProductNum());	
	}
}

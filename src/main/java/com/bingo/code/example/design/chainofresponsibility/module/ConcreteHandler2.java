package com.bingo.code.example.design.chainofresponsibility.module;

/**
 * �����ְ�����������������
 */
public class ConcreteHandler2 extends Handler {
	public void handleRequest() {
		//����ĳЩ�������ж��Ƿ������Լ������ְ��Χ
		//�ж��������磺���ⲿ����Ĳ�����������������ȥ��ȡ���ⲿ���ݣ�
		//������ݿ��л�ȡ�ȣ�������仰ֻ�Ǹ�ʾ��
		boolean someCondition = true;
		
		if(someCondition){
			//��������Լ������ְ��Χ���������ﴦ������
			
			//����Ĵ������
			System.out.println("ConcreteHandler2 handle request");
		}else{
			//����������Լ������ְ��Χ���Ǿ��ж��Ƿ��к�̵�ְ�����
			//����У���ת���������̵�ְ�����
			//���û�У�ʲô����������Ȼ����
			if(this.successor!=null){
				this.successor.handleRequest();
			}
		}
	}
}


package com.bingo.code.example.design.strategy.logtemplate;
/**
 * ����־��¼�����ݿ�
 */
public class DbLog extends LogStrategyTemplate{
	public void doLog(String msg) {		
		//�������
		if(msg!=null && msg.trim().length()>5){
			int a = 5/0;
		}
		System.out.println("���ڰ� '"+msg+"' ��¼�����ݿ���");
	}
}

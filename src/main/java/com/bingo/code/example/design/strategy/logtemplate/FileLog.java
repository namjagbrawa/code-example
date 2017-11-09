package com.bingo.code.example.design.strategy.logtemplate;
/**
 * ����־��¼�����ݿ�
 */
public class FileLog extends LogStrategyTemplate{
	public void doLog(String msg) {
		System.out.println("���ڰ� '"+msg+"' ��¼���ļ���");
	}
}

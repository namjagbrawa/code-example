package com.bingo.code.example.design.strategy.example8;
/**
 * ����־��¼�����ݿ�
 */
public class FileLog extends LogStrategyTemplate{
	public void doLog(String msg) {
		System.out.println("���ڰ� '"+msg+"' ��¼���ļ���");
	}
}

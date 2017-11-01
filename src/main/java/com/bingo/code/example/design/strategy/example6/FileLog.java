package com.bingo.code.example.design.strategy.example6;
/**
 * ����־��¼���ļ�
 */
public class FileLog implements LogStrategy{
	public void log(String msg) {
		System.out.println("���ڰ� '"+msg+"' ��¼���ļ���");
	}
}

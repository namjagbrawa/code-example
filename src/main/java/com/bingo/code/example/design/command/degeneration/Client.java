package com.bingo.code.example.design.command.degeneration;

public class Client {
	public static void main(String[] args) {
		//׼��Ҫ����������
		Command cmd = new PrintService("�˻�������ģʽʾ��");
		//���������������
		Invoker invoker = new Invoker();
		invoker.setCmd(cmd);
		
		//���°�ť����������ִ������
		invoker.startPrint();
	}
}
package com.bingo.code.example.design.command.module;

public class Client {
	/**
	 * ʾ�⣬���𴴽�������󣬲��趨���Ľ�����
	 */
	public void assemble(){
		//����������
		Receiver receiver = new Receiver();
		//������������趨���Ľ�����
		Command command = new ConcreteCommand(receiver);
		//����Invoker��������������ý�ȥ
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
	}
}

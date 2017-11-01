package com.bingo.code.example.design.command.module;
/**
 * ������
 */
public class Invoker {
	/**
	 * �����������
	 */
	private Command command = null;
	/**
	 * ���õ����߳��е��������
	 * @param command �������
	 */
	public void setCommand(Command command) {
		this.command = command;
	}
	/**
	 * ʾ�ⷽ����Ҫ������ִ������
	 */
	public void runCommand() {
		//������������ִ�з���
		command.execute();
	}
}

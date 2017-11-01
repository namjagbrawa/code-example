package com.bingo.code.example.design.command.degeneration;

public class Invoker {
	/**
	 * �����������
	 */
	private Command cmd = null;
	/**
	 * �����������
	 * @param cmd �������
	 */
	public void setCmd(Command cmd){
		this.cmd = cmd;
	}
	/**
	 * ��ʼ��ӡ
	 */
	public void startPrint(){
		//ִ������Ĺ���
		this.cmd.execute();
	}
}
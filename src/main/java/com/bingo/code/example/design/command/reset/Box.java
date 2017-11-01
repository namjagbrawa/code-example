package com.bingo.code.example.design.command.reset;

/**
 * ������󣬱����а�ť�����а�ť��Ӧ���������
 */
public class Box {
	/**
	 * �����������
	 */
	private Command openCommand;
	/**
	 * ���ÿ����������
	 * @param command �����������
	 */
	public void setOpenCommand(Command command){
		this.openCommand = command;
	}
	/**
	 * �ṩ���ͻ�ʹ�ã����ܲ���Ӧ�û������൱�ڿ�����ť�����´����ķ���
	 */
	public void openButtonPressed(){
		//���°�ť��ִ������
		openCommand.execute();
	}
	/**
	 * ���������������
	 */
	private Command resetCommand;
	/**
	 * �������������������
	 * @param command 
	 */
	public void setResetCommand(Command command){
		this.resetCommand = command;
	}
	/**
	 * �ṩ���ͻ�ʹ�ã����ܲ���Ӧ�û������൱��������ť�����´����ķ���
	 */
	public void resetButtonPressed(){
		//���°�ť��ִ������
		resetCommand.execute();
	}
}

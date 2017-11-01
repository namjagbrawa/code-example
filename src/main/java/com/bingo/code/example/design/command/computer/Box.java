package com.bingo.code.example.design.command.computer;
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
	 * �ṩ���ͻ�ʹ�ã����ܲ���Ӧ�û������൱�ڰ�ť�����´����ķ���
	 */
	public void openButtonPressed(){
		//���°�ť��ִ������
		openCommand.execute();
	}
}

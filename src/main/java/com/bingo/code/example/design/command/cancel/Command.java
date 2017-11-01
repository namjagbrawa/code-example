package com.bingo.code.example.design.command.cancel;
/**
 * ����ӿڣ�����ִ�еĲ�����֧�ֿɳ�������
 */
public interface Command {
	/**
	 * ִ�������Ӧ�Ĳ���
	 */
	public void execute();
	/**
	 * ִ�г��������Ӧ�Ĳ���
	 */
	public void undo();
}

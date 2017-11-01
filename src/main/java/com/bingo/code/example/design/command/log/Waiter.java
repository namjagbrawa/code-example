package com.bingo.code.example.design.command.log;

/**
 * ����Ա��������ϲ˵�,������ִ�е���
 */
public class Waiter {
	/**
	 * ����һ����������󡪡��˵�
	 */
	private MenuCommand menuCommand = new MenuCommand();
	/**
	 * �ͻ����
	 * @param cmd �ͻ���Ĳˣ�ÿ������һ���������
	 */
	public void orderDish(Command cmd){
		//��ӵ��˵���
		menuCommand.addCommand(cmd);
	}
	/**
	 * �ͻ������ϣ���ʾҪִ�������ˣ��������ִ�в˵�����������
	 */
	public void orderOver(){
		this.menuCommand.execute();
	}
}

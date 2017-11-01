package com.bingo.code.example.design.command.reset;
/**
 * ���������ʵ�֣�ʵ��Command�ӿڣ�
 * ���п������������ʵ�֣�ͨ�����ý����ߵķ�����ʵ������
 */
public class OpenCommand implements Command{
	/**
	 * ��������ʵ������Ľ����ߡ����������
	 */
	private MainBoardApi mainBoard = null;
	/**
	 * ���췽���������������
	 * @param mainBoard �������
	 */
	public OpenCommand(MainBoardApi mainBoard) {
		this.mainBoard = mainBoard;
	}
	
	public void execute() {
		//����������󣬸�����֪����ο�������ת���������
		//������ȥ��ɿ����Ĺ���
		this.mainBoard.open();
	}
}

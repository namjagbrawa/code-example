package com.bingo.code.example.design.command.computer;

public class Client {
	public static void main(String[] args) {
		//1���������������ʵ������������൱������װ������
		//�ѻ����ϰ�ť�������߲�ӵ������ϡ�
		MainBoardApi mainBoard = new GigaMainBoard();
		OpenCommand openCommand = new OpenCommand(mainBoard);
		//2��Ϊ�����ϵİ�ť���ö�Ӧ������ð�ť֪���ø�ʲô
		Box box = new Box();
		box.setOpenCommand(openCommand);
		
		//3��Ȼ��ģ�ⰴ�»����ϵİ�ť
		box.openButtonPressed();
	}
}
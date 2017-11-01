package com.bingo.code.example.design.command.reset;

public class Client {
	public static void main(String[] args) {
		//1���������������ʵ������������൱������װ������
		//�ѻ����ϰ�ť�������߲�ӵ������ϡ�
		MainBoardApi mainBoard = new GigaMainBoard();
		//������������
		OpenCommand openCommand = new OpenCommand(mainBoard);
		//������������������
		ResetCommand resetCommand = new ResetCommand(mainBoard);
		
		//2��Ϊ�����ϵİ�ť���ö�Ӧ������ð�ť֪���ø�ʲô
		Box box = new Box();
		//����ȷ���ã����ǿ�����ť�Կ������������ť����������
		box.setOpenCommand(openCommand);
		box.setResetCommand(resetCommand);
		
		//3��Ȼ��ģ�ⰴ�»����ϵİ�ť
		System.out.println("��ȷ������------------------------->");
		System.out.println(">>>���¿�����ť��>>>");
		box.openButtonPressed();
		System.out.println(">>>����������ť��>>>");
		box.resetButtonPressed();
		
		//Ȼ������������һ�أ������ǽ��в���������
		//���ǿ�����ť���������������ť�Կ�������
		box.setOpenCommand(resetCommand);
		box.setResetCommand(openCommand);
		//4��Ȼ������ģ�ⰴ�»����ϵİ�ť
		System.out.println("����������------------------------->");
		System.out.println(">>>���¿�����ť��>>>");
		box.openButtonPressed();
		System.out.println(">>>����������ť��>>>");
		box.resetButtonPressed();
	}
}
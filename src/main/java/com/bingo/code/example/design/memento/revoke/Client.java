package com.bingo.code.example.design.memento.revoke;

public class Client {
	public static void main(String[] args) {
		//1����װ����ͽ�����
		//����������
		OperationApi operation = new Operation();
		//��������
		AddCommand addCmd = new AddCommand(5);
		SubstractCommand substractCmd = new SubstractCommand(3);
		//��װ����ͽ�����
		addCmd.setOperation(operation);
		substractCmd.setOperation(operation);
		
		//2�����������õ������ߣ����Ǽ���������
		Calculator calculator = new Calculator();
		calculator.setAddCmd(addCmd);
		calculator.setSubstractCmd(substractCmd);
		
		//3:ģ�ⰴ�°�ť������һ��
		calculator.addPressed();
		System.out.println("һ�μӷ������Ľ��Ϊ��"+operation.getResult());
		calculator.substractPressed();
		System.out.println("һ�μ��������Ľ��Ϊ��"+operation.getResult());
		
		//���Գ���
		calculator.undoPressed();
		System.out.println("����һ�κ�Ľ��Ϊ��"+operation.getResult());
		calculator.undoPressed();
		System.out.println("�ٳ���һ�κ�Ľ��Ϊ��"+operation.getResult());
		
		//���Իָ�
		calculator.redoPressed();
		System.out.println("�ָ�����һ�κ�Ľ��Ϊ��"+operation.getResult());
		calculator.redoPressed();
		System.out.println("�ٻָ�����һ�κ�Ľ��Ϊ��"+operation.getResult());
	}
}

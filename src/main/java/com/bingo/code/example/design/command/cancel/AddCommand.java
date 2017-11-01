package com.bingo.code.example.design.command.cancel;
/**
 * ����ļӷ�����ʵ�ֶ���
 */
public class AddCommand implements Command{
	/**
	 * ���о���ִ�м���Ķ���
	 */
	private OperationApi operation = null;
	/**
	 * ���������ݣ�Ҳ����Ҫ���ϵ�����
	 */
	private int opeNum;
	/**
	 * ���췽�����������ִ�м���Ķ���
	 * @param operation ����ִ�м���Ķ���
	 * @param opeNum Ҫ���ϵ�����
	 */
	public AddCommand(OperationApi operation,int opeNum){
		this.operation = operation;
		this.opeNum = opeNum;
	}
	
	public void execute() {
		//ת��������ȥ����ִ�й��ܣ�������������ӷ�
		this.operation.add(opeNum);
	}
	
	public void undo() {
		//ת��������ȥ����ִ�й���
		//����������ӷ�����ô������ʱ�������������
		this.operation.substract(opeNum);
	}
}

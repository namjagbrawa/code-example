package com.bingo.code.example.design.command.cancel;
/**
 * ����ļ�������ʵ�ֶ���
 */
public class SubstractCommand implements Command{
	/**
	 * ���о���ִ�м���Ķ���
	 */
	private OperationApi operation = null;
	/**
	 * ���������ݣ�Ҳ����Ҫ��ȥ������
	 */
	private int opeNum;
	/**
	 * ���췽�����������ִ�м���Ķ���
	 * @param operation ����ִ�м���Ķ���
	 * @param opeNum Ҫ��ȥ������
	 */
	public SubstractCommand(OperationApi operation,int opeNum){
		this.operation = operation;
		this.opeNum = opeNum;
	}	
	
	public void execute() {
		//ת��������ȥ����ִ�й��ܣ����������������
		this.operation.substract(opeNum);
	}
	
	public void undo() {
		//ת��������ȥ����ִ�й���
		//�����������������ô������ʱ��������ӷ���
		this.operation.add(opeNum);
	}
}

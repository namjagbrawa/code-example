package com.bingo.code.example.design.command.cook;


/**
 * ��������̶��Ź���
 */
public class ChopCommand implements Command{
	/**
	 * ���о������˵ĳ�ʦ�Ķ���
	 */
	private CookApi cookApi = null;
	/**
	 * ���þ������˵ĳ�ʦ�Ķ���
	 * @param cookApi �������˵ĳ�ʦ�Ķ���
	 */
	public void setCookApi(CookApi cookApi) {
		this.cookApi = cookApi;
	}
	/**
	 * ��˵�����
	 */
	private int tableNum;
	/**
	 * ���췽���������˵�����
	 * @param tableNum ��˵�����
	 */
	public ChopCommand(int tableNum){
		this.tableNum = tableNum;
	}
	public int getTableNum(){
		return this.tableNum;
	}
	
	public void execute() {
		this.cookApi.cook(tableNum,"�̶��Ź���");
	}
}

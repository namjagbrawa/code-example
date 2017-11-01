package com.bingo.code.example.design.command.cook;
/**
 * ����ӿڣ�����ִ�еĲ���
 */
public interface Command {
	/**
	 * ִ�������Ӧ�Ĳ���
	 */
	public void execute();
	/**
	 * ��������Ľ�����
	 * @param cookApi ����Ľ����� 
	 */
	public void setCookApi(CookApi cookApi);
	/**
	 * ���ط�����������ţ����ǵ�˵�����
	 * @return �������������
	 */
	public int getTableNum();
}
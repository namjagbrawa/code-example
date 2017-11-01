package com.bingo.code.example.design.command.cancel;
/**
 * ��������Ľӿ�
 */
public interface OperationApi {
	/**
	 * ��ȡ������ɺ�Ľ��
	 * @return ������ɺ�Ľ��
	 */
	public int getResult();
	/**
	 * ���ü��㿪ʼ�ĳ�ʼֵ
	 * @param result ���㿪ʼ�ĳ�ʼֵ
	 */
	public void setResult(int result);
	/**
	 * ִ�мӷ�
	 * @param num ��Ҫ�ӵ���
	 */
	public void add(int num);
	/**
	 * ִ�м���
	 * @param num ��Ҫ������
	 */
	public void substract(int num);
}

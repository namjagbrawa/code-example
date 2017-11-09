package com.bingo.code.example.design.memento.revoke;

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
	 * ִ�мӷ�
	 * @param num ��Ҫ�ӵ���
	 */
	public void add(int num);
	/**
	 * ִ�м���
	 * @param num ��Ҫ������
	 */
	public void substract(int num);
	
	/**
	 * ��������ԭ���������״̬�ı���¼����
	 * @return �����õı���¼����
	 */
	public Memento createMemento();
	/**
	 * ��������ԭ���������״̬������ص�����¼�����¼��״̬
	 * @param memento ��¼��ԭ����״̬�ı���¼����
	 */
	public void setMemento(Memento memento);
}

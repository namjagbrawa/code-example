package com.bingo.code.example.design.observer.push;
/**
 * �۲��ߣ����籨ֽ�Ķ���
 */
public interface Observer {
	/**
	 * ��֪ͨ�ķ�����ֱ�Ӱѱ�ֽ���������͹���
	 * @param content ��ֽ������
	 */
	public void update(String content);
}

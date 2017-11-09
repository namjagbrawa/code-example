package com.bingo.code.example.design.state.module;


/**
 * ��װ��Context��һ���ض�״̬��ص���Ϊ
 */
public interface State {
	/**
	 * ״̬��Ӧ�Ĵ���
	 * @param sampleParameter ʾ��������˵�����Դ�����������崫��
	 *             ʲô���Ĳ��������뼸���������ɾ���Ӧ�����������
	 */
	public void handle(String sampleParameter);
}
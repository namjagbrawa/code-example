package com.bingo.code.example.design.chainofresponsibility.module;
/**
 * ְ��Ľӿڣ�Ҳ���Ǵ�������Ľӿ�
 */
public abstract class Handler {
	/**
	 * ���к�̵�ְ�����
	 */
	protected Handler successor;
	/**
	 * ���ú�̵�ְ�����
	 * @param successor ��̵�ְ�����
	 */
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	/**
	 * ʾ�⴦������ķ�������Ȼ���ʾ�ⷽ����û�д��������
	 * ��ʵ���ǿ��Դ�������ģ����ݾ�����Ҫ��ѡ���Ƿ񴫵ݲ���
	 */
	public abstract void handleRequest();
}


package com.bingo.code.example.design.chainofresponsibility.allprocess;
/**
 * ����ְ�����Ľӿ�
 */
public abstract class SaleHandler {
	/**
	 * ������һ����������Ķ���
	 */
	protected SaleHandler successor = null;
	/**
	 * ������һ����������Ķ���
	 * @param successor ��һ����������Ķ���
	 */
	public void setSuccessor(SaleHandler successor){
		this.successor = successor;
	}
	/**
	 * ������������Ϣ������
	 * @param user ������Ա
	 * @param customer �ͻ�
	 * @param saleModel ��������
	 * @return �Ƿ���ɹ�
	 */
	public abstract boolean sale(String user,String customer,SaleModel saleModel);
}

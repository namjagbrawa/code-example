package com.bingo.code.example.design.chainofresponsibility.allprocess;
/**
 * �����������۵�ҵ���ܵ�ְ�����
 */
public class SaleMgr extends SaleHandler{
	public boolean sale(String user, String customer, SaleModel saleModel) {
		//����������ҵ���߼�����
		System.out.println(user+"������"+customer+"���� "+saleModel+" ����������");
		return true;
	}
}

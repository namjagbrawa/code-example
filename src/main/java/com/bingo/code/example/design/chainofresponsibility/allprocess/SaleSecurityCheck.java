package com.bingo.code.example.design.chainofresponsibility.allprocess;
/**
 * ����Ȩ�޼���ְ�����
 */
public class SaleSecurityCheck extends SaleHandler{
	public boolean sale(String user, String customer, SaleModel saleModel) {
		//����Ȩ�޼�飬�򵥵㣬��С����ͨ��
		if("С��".equals(user)){
			return this.successor.sale(user, customer, saleModel);
		}else{
			System.out.println("�Բ���"+user+"����û�б���������Ϣ��Ȩ��");
			return false;
		}		
	}
}
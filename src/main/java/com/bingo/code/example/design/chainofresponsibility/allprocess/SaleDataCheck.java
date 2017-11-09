package com.bingo.code.example.design.chainofresponsibility.allprocess;
/**
 * ��������ͨ�ü���ְ�����
 */
public class SaleDataCheck extends SaleHandler{
	public boolean sale(String user, String customer, SaleModel saleModel) {
		//��������ͨ�ü�飬���鷳�㣬ÿ�����ݶ�Ҫ���
		if(user==null || user.trim().length()==0){
			System.out.println("�����˲���Ϊ��");
			return false;
		}
		if(customer==null || customer.trim().length()==0){
			System.out.println("�ͻ�����Ϊ��");
			return false;
		}
		if(saleModel==null ){
			System.out.println("������Ʒ�����ݲ���Ϊ��");
			return false;
		}
		if(saleModel.getGoods()==null ||saleModel.getGoods().trim().length()==0){
			System.out.println("���۵���Ʒ����Ϊ��");
			return false;
		}
		if(saleModel.getSaleNum()==0){
			System.out.println("������Ʒ����������Ϊ0");
			return false;
		}		
		//���ͨ��������ļ�⣬�Ǿ����¼���ִ��
		return this.successor.sale(user, customer, saleModel);
	}
}

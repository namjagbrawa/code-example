package com.bingo.code.example.design.decorator.salebusiness;
/**
 * ʵ��Ȩ�޿���
 */
public class CheckDecorator extends Decorator{
	public CheckDecorator(GoodsSaleEbi ebi){
		super(ebi);
	}
	
	public boolean sale(String user,String customer, SaleModel saleModel) {
		//�򵥵㣬ֻ������ִ���������
		if(!"����".equals(user)){
			System.out.println("�Բ���"+user+"����û�б������۵���Ȩ��");
			//�Ͳ��ٵ��ñ�װ�ζ���Ĺ�����
			return false;
		}else{
			return this.ebi.sale(user, customer, saleModel);
		}		
	}
}

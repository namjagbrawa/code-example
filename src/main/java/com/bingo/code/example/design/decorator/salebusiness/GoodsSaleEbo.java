package com.bingo.code.example.design.decorator.salebusiness;

public class GoodsSaleEbo implements GoodsSaleEbi{
	
	public boolean sale(String user,String customer, SaleModel saleModel) {
		System.out.println(user+"������"+customer+"���� "+saleModel+" ����������");
		return true;
	}
}

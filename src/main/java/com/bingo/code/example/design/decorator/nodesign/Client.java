package com.bingo.code.example.design.decorator.nodesign;

public class Client {
	public static void main(String[] args) {
		//�ȴ������㽱��Ķ���
		Prize p = new Prize();
		
		//���ڶ���û�����ϣ����Դ�null�Ϳ�����
		double zs = p.calcPrize("����",null,null);		
		System.out.println("==========����Ӧ�ý���"+zs);
		double ls = p.calcPrize("����",null,null);
		System.out.println("==========����Ӧ�ý���"+ls);		
		double ww = p.calcPrize("����",null,null);
		System.out.println("==========������Ӧ�ý���"+ww);
	}
}

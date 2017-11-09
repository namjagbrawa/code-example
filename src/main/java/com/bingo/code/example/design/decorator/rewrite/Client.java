package com.bingo.code.example.design.decorator.rewrite;

/**
 * ʹ��װ��ģʽ�Ŀͻ���
 */
public class Client {
	public static void main(String[] args) {
		//�ȴ����������������࣬��Ҳ�Ǳ�װ�εĶ���
		Component c1 = new ConcreteComponent();
		
		//Ȼ��Լ���Ļ����������װ�Σ�����Ҫ��ϸ���װ��
		//˵��������װ����֮������ǲ�Ҫ���Ⱥ�˳������ƣ�Ҳ������װ��˭�ͺ�װ��˭��Ӧ����һ����
		
		//�������ͨҵ����Ա�Ľ������
		Decorator d1 = new MonthPrizeDecorator(c1);
		Decorator d2 = new SumPrizeDecorator(d1);	
		
		//ע�⣺����ֻ��Ҫʹ�������ϺõĶ������ҵ�񷽷����ɣ������ε��û�ȥ
		//���ڶ���û�����ϣ����Դ�null�Ϳ�����
		double zs = d2.calcPrize("����",null,null);		
		System.out.println("==========����Ӧ�ý���"+zs);
		double ls = d2.calcPrize("����",null,null);
		System.out.println("==========����Ӧ�ý���"+ls);
		
		//�����ҵ��������Ҫһ�������ŶӵĽ������
		Decorator d3 = new GroupPrizeDecorator(d2);
		double ww = d3.calcPrize("����",null,null);
		System.out.println("==========������Ӧ�ý���"+ww);
		
	}
}

package com.bingo.code.example.design.strategy.newstrategy;

public class Client {
	public static void main(String[] args) {
		//������Ӧ��֧������
		PaymentStrategy strategyRMB = new RMBCash();
		PaymentStrategy strategyDollar = new DollarCash();
		
		//׼��С���֧������������
		PaymentContext ctx1 = new PaymentContext("С��",5000,strategyRMB);
		//��С��֧������
		ctx1.payNow();
		
		//�л�һ���ˣ���petter֧������
		PaymentContext ctx2 = new PaymentContext("Petter",8000,strategyDollar);
		ctx2.payNow();
		
		//��������ӵ�֧����ʽ
		PaymentStrategy strategyCard = new Card();
		PaymentContext ctx3 = new PaymentContext2("С��",9000,"010998877656",strategyCard);
		ctx3.payNow();
		
		//��������ӵ�֧����ʽ
		PaymentStrategy strategyCard2 = new Card2("010998877656");
		PaymentContext ctx4 = new PaymentContext("С��",9000,strategyCard2);
		ctx4.payNow();
	}
}

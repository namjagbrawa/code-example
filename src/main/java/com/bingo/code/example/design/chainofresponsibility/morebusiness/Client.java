package com.bingo.code.example.design.chainofresponsibility.morebusiness;

public class Client {
	public static void main(String[] args) {
		//��Ҫ��װְ����		
		Handler h1 = new GeneralManager2();
		Handler h2 = new DepManager2();
		Handler h3 = new ProjectManager2();
		h3.setSuccessor(h2);
		h2.setSuccessor(h1);
		
		//��ʼ��������۲ͷ���
		FeeRequestModel frm = new FeeRequestModel();
		frm.setFee(300);
		frm.setUser("С��");
		//���ô���
		String ret1 = (String)h3.handleRequest(frm);
		System.out.println("ret1="+ret1);
		
		//��������������ٵ��ô���
		frm.setFee(800);		
		h3.handleRequest(frm);
		String ret2 = (String)h3.handleRequest(frm);
		System.out.println("ret2="+ret2);
		
		//��������������ٵ��ô���
		frm.setFee(1600);		
		h3.handleRequest(frm);
		String ret3 = (String)h3.handleRequest(frm);
		System.out.println("ret3="+ret3);
		
		//��ʼ��������Ԥ֧���÷���
		PreFeeRequestModel pfrm = new PreFeeRequestModel();
		pfrm.setFee(3000);
		pfrm.setUser("С��");
		//���ô���
		h3.handleRequest(pfrm);
		//��������������ٵ��ô���
		pfrm.setFee(6000);
		h3.handleRequest(pfrm);
		//��������������ٵ��ô���
		pfrm.setFee(36000);
		h3.handleRequest(pfrm);
	}
}

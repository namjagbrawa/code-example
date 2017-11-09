package com.bingo.code.example.design.chainofresponsibility.nodesign;

public class Client {
	public static void main(String[] args) {
		FeeRequest request = new FeeRequest();
		
		//��ʼ����
		String ret1 = request.requestToProjectManager("С��", 300);
		System.out.println("the ret1="+ret1);		
		String ret2 = request.requestToProjectManager("С��", 300);
		System.out.println("the ret2="+ret2);
		
		String ret3 = request.requestToProjectManager("С��", 600);
		System.out.println("the ret3="+ret3);		
		String ret4 = request.requestToProjectManager("С��", 600);
		System.out.println("the ret4="+ret4);
		
		String ret5 = request.requestToProjectManager("С��", 1200);
		System.out.println("the ret5="+ret5);		
		String ret6 = request.requestToProjectManager("С��", 1200);
		System.out.println("the ret6="+ret6);
	}
}

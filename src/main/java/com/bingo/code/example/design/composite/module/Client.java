package com.bingo.code.example.design.composite.module;

public class Client {
	public static void main(String[] args) {
		//������Composite����
		Component root = new Composite();
		Component c1 = new Composite();
		Component c2 = new Composite();
		//������Ҷ�Ӷ���
		Component leaf1 = new Leaf();
		Component leaf2 = new Leaf();
		Component leaf3 = new Leaf();
		
		//��ͳ�Ϊ���εĶ���ṹ
		root.addChild(c1);
		root.addChild(c2);
		root.addChild(leaf1);
		
		c1.addChild(leaf2);
		c2.addChild(leaf3);
		
		//����Component����
		Component o = root.getChildren(1);
		System.out.println(o);
	}
}

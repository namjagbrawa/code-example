package com.bingo.code.example.design.composite.secure;

public class Client {
	public static void main(String[] args) {
		//�������е���϶���
		Composite root = new Composite("��װ");
		Composite c1 = new Composite("��װ");
		Composite c2 = new Composite("Ůװ");
		//�������е�Ҷ�Ӷ���
		Leaf leaf1 = new Leaf("����");
		Leaf leaf2 = new Leaf("�п�");
		Leaf leaf3 = new Leaf("ȹ��");
		Leaf leaf4 = new Leaf("��װ");
		//�������Ľṹ�������϶����Ҷ�Ӷ���
		root.addChild(c1);
		root.addChild(c2);
		
		c1.addChild(leaf1);
		c1.addChild(leaf2);
		
		c2.addChild(leaf3);
		c2.addChild(leaf4);
		
		//���ø������������������������
		root.printStruct("");
	}
}

package com.bingo.code.example.design.composite.nodesign;

public class Client {
	public static void main(String[] args) {
		//�������е���϶���
		Composite root = new Composite("root");
		Composite c1 = new Composite("c1");
		Composite c2 = new Composite("c2");
		//�������е�Ҷ�Ӷ���
		Leaf leaf1 = new Leaf("l1");
		Leaf leaf2 = new Leaf("l2");
		Leaf leaf3 = new Leaf("l3");
		Leaf leaf4 = new Leaf("l4");
		//�������Ľṹ�������϶����Ҷ�Ӷ���
		root.addComposite(c1);
		root.addComposite(c2);
		
		c1.addLeaf(leaf1);
		c1.addLeaf(leaf2);
		
		c2.addLeaf(leaf3);
		c2.addLeaf(leaf4);
		
		//���ø������������������������
		root.printStruct("");
	}
}

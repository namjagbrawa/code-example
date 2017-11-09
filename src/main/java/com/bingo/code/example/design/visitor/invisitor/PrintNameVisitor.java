package com.bingo.code.example.design.visitor.invisitor;
/**
 * ����ķ����ߣ�ʵ�֣������������ƣ�����϶��������ǰ�����"�ڵ㣺"��
 * ��Ҷ�Ӷ��������ǰ�����"Ҷ�ӣ�"
*/
public class PrintNameVisitor implements Visitor {
	public void visitComposite(Composite composite) {
		//���ʵ���϶��������
		System.out.println("�ڵ㣺"+composite.getName());
	}
	public void visitLeaf(Leaf leaf) {
		//���ʵ�Ҷ�Ӷ��������		
		System.out.println("Ҷ�ӣ�"+leaf.getName());
	}
}

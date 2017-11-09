package com.bingo.code.example.design.visitor.rewrite;
/**
 * ����ķ����ߣ�ʵ�ֶԿͻ���ֵ����
 */
public class WorthAnalyzeVisitor implements Visitor {
	public void visitEnterpriseCustomer(EnterpriseCustomer ec){
		//���ݹ���Ľ���С������Ĳ�Ʒ�ͷ���Ķ��١������Ƶ�ʵȽ��з���
		//��ҵ�ͻ��ı�׼��ȸ��˿ͻ��ĸ�
		System.out.println("���ڶ���ҵ�ͻ�"+ec.getName()+"���м�ֵ����");
	}
	public void visitPersonalCustomer(PersonalCustomer pc){
		System.out.println("���ڶԸ��˿ͻ�"+pc.getName()+"���м�ֵ����");
	}
}
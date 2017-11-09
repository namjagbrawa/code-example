package com.bingo.code.example.design.visitor.composite;

/**
 * ����ṹ,ͨ���������Ԫ�ض�����б������÷������ܷ��ʵ����е�Ԫ��
 */
public class ObjectStructure {
	/**
	 * ��ʾ����ṹ��������һ����Ͻṹ
	 */
	private Component root = null;
	/**
	 * �ṩ���ͻ��˲����ĸ߲�ӿ�
	 * @param visitor �ͻ�����Ҫʹ�õķ�����
	 */
	public void handleRequest(Visitor visitor){
		//����϶���ṹ�еĸ�Ԫ�أ����ܷ���
		//����϶���ṹ���Ѿ�ʵ����Ԫ�صı���
		if(root!=null){
			root.accept(visitor);
		}
	}
	/**
	 * ������϶���ṹ
	 * @param ele ��϶���ṹ
	 */
	public void setRoot(Component ele){
		this.root = ele;
	}
}

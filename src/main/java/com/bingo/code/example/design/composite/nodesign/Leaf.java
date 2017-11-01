package com.bingo.code.example.design.composite.nodesign;
/**
 * Ҷ�Ӷ���
 */
public class Leaf {
	/**
	 * Ҷ�Ӷ��������
	 */
	private String name = "";
	/**
	 * ���췽��������Ҷ�Ӷ��������
	 * @param name Ҷ�Ӷ��������
	 */
	public Leaf(String name){
		this.name = name;
	}
	/**
	 * ���Ҷ�Ӷ���Ľṹ��Ҷ�Ӷ���û���Ӷ���Ҳ�������Ҷ�Ӷ��������
	 * @param preStr ǰ׺����Ҫ�ǰ��ղ㼶ƴ�ӵĿո�ʵ���������
	 */
	public void printStruct(String preStr){
		System.out.println(preStr+"-"+name);
	}
}

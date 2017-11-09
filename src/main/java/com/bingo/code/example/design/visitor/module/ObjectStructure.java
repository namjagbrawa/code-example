package com.bingo.code.example.design.visitor.module;
import java.util.*;
/**
 * ����ṹ,ͨ���������Ԫ�ض�����б������÷������ܷ��ʵ����е�Ԫ��
 */
public class ObjectStructure {
	/**
	 * ʾ�⣬��ʾ����ṹ��������һ����Ͻṹ���Ǽ���
	 */
	private Collection<Element> col = new ArrayList<Element>();
	/**
	 * ʾ�ⷽ�����ṩ���ͻ��˲����ĸ߲�ӿ�
	 * @param visitor �ͻ�����Ҫʹ�õķ�����
	 */
	public void handleRequest(Visitor visitor){
		//ѭ������ṹ�е�Ԫ�أ����ܷ���
		for(Element ele : col){
			ele.accept(visitor);
		}
	}
	/**
	 * ʾ�ⷽ�����齨����ṹ�������ṹ�����Ԫ�ء�
	 * ��ͬ�Ķ���ṹ�в�ͬ�Ĺ�����ʽ
	 * @param ele ���뵽����ṹ��Ԫ��
	 */
	public void addElement(Element ele){
		this.col.add(ele);
	}
}

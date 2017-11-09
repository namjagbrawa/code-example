package com.bingo.code.example.design.visitor.rewrite;
import java.util.*;
/**
 * ����ṹ,ͨ���������Ԫ�ض�����б������÷������ܷ��ʵ����е�Ԫ��
 */
public class ObjectStructure {
	/**
	 * Ҫ�����Ŀͻ�����
	 */
	private Collection<Customer> col = new ArrayList<Customer>();
	/**
	 * �ṩ���ͻ��˲����ĸ߲�ӿڣ�����Ĺ����ɿͻ��˴���ķ����߾���
	 * @param visitor �ͻ�����Ҫʹ�õķ�����
	 */
	public void handleRequest(Visitor visitor){
		//ѭ������ṹ�е�Ԫ�أ����ܷ���
		for(Customer cm : col){
			cm.accept(visitor);
		}
	}
	/**
	 * �齨����ṹ�������ṹ�����Ԫ�ء�
	 * ��ͬ�Ķ���ṹ�в�ͬ�Ĺ�����ʽ
	 * @param ele ���뵽����ṹ��Ԫ��
	 */
	public void addElement(Customer ele){
		this.col.add(ele);
	}
}

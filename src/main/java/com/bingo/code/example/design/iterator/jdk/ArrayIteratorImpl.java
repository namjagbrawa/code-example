package com.bingo.code.example.design.iterator.jdk;

import java.util.Iterator;
/**
 * ����ʵ�ַ�������ĵ����ӿ�
 */
public class ArrayIteratorImpl implements Iterator{
	/**
	 * ������ű������ľۺ϶���
	 */
	private SalaryManager aggregate = null;
	/**
	 * ������¼��ǰ��������λ������
	 */
	private int index = 0;
	
	public ArrayIteratorImpl(SalaryManager aggregate){
		this.aggregate = aggregate;
	}
	
	
	public boolean hasNext() {
		//�ж��Ƿ�����һ��Ԫ��
		if(aggregate!=null && index<aggregate.size()){
			return true;
		}
		return false;
	}

	
	public Object next() {
		Object retObj = null;
		if(hasNext()){
			retObj = aggregate.get(index);
			//ÿȡ��һ��ֵ���Ͱ��ѷ���������1
			index++;
		}
		return retObj;
	}

	
	public void remove() {
		//��ʱ���Բ�ʵ��		
	}
}

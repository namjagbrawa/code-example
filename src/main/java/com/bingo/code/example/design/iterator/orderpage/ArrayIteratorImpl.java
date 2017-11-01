package com.bingo.code.example.design.iterator.orderpage;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ����ʵ�ַ�ҳ���ʾۺ�Ԫ�صĵ����ӿ�
 */
public class ArrayIteratorImpl implements AggregationIterator{
	/**
	 * ������ű�����������
	 */
	private PayModel[] pms = null;
	/**
	 * ������¼��ǰ��������λ������
	 */
	private int index = 0;
	
	public ArrayIteratorImpl(SalaryManager aggregate){
		this.pms = aggregate.getPays();
	}
	
	public boolean hasNext() {
		//�ж��Ƿ�����һ��Ԫ��
		if(pms!=null && index<=(pms.length-1)){
			return true;
		}
		return false;
	}

	
	public Collection next(int num) {
		Collection col = new ArrayList();
		int count=0;
		while(hasNext() && count<num){
			col.add(pms[index]);
			//ÿȡ��һ��ֵ���Ͱ��ѷ���������1
			index++;
			count++;
		}
		return col;
	}

	
	public boolean hasPrevious() {
		if(pms!=null && index > 0){
			return true;
		}
		return false;
	}

	
	public Collection previous(int num){
		Collection col = new ArrayList();
		int count=0;
		//�򵥵�ʵ�־��ǰ������˻�ȥnum����Ȼ����ȡֵ��
		//����ʵ������ʵ�����п��ܶ��˻�ȥ���ݵģ����磺�Ѿ��������һҳ���������һҳ�����ݲ���һҳ�����ݣ���ô�˻�ȥnum���������˶���
		//Ϊ��ʾ���ļ���ԣ�����Ͳ�ȥ������
		index = index - num;
		while(hasPrevious() && count<num){
			col.add(pms[index]);
			index ++;
			count++;
		}
		return col;
	}
}

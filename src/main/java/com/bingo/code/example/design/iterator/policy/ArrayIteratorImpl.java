package com.bingo.code.example.design.iterator.policy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ����ʵ�ַ�������ĵ����ӿ�,�����˵�������
 */
public class ArrayIteratorImpl implements Iterator{
	/**
	 * ������ű�����������
	 */
	private PayModel[] pms = null;
	/**
	 * ������¼��ǰ��������λ������
	 */
	private int index = 0;
	
	public ArrayIteratorImpl(SalaryManager aggregate){
		//�������ȶԾۺ϶�������ݽ��й��ˣ����繤�ʱ�����3000����
		Collection<PayModel> tempCol = new ArrayList<PayModel>();
		for(PayModel pm : aggregate.getPays()){
			if(pm.getPay() < 3000){
				tempCol.add(pm);
			}
		}
		//Ȼ��ѷ���Ҫ������ݴ�ŵ���������������
		this.pms = new PayModel[tempCol.size()];
		int i=0;
		for(PayModel pm : tempCol){
			this.pms[i] = pm;
			i++;
		}
	}
	
	
	public boolean hasNext() {
		//�ж��Ƿ�����һ��Ԫ��
		if(pms!=null && index<=(pms.length-1)){
			return true;
		}
		return false;
	}

	
	public Object next() {
		Object retObj = null;
		if(hasNext()){
			retObj = pms[index];
			//ÿȡ��һ��ֵ���Ͱ��ѷ���������1
			index++;
		}
		
		//�������Ҫ���ص����ݽ��й��ˣ����粻�ò鿴��������
		((PayModel)retObj).setPay(0.0);
		
		return retObj;
	}

	
	public void remove() {
		//��ʱ���Բ�ʵ��		
	}
}

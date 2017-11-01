package com.bingo.code.example.design.iterator.randompage;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ����ʵ�������ҳ���ʾۺ�Ԫ�صĵ����ӿ�
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
	
	public boolean hasPrevious() {
		if(pms!=null && index > 0){
			return true;
		}
		return false;
	}
	
	public Collection getPage(int pageNum,int pageShow){
		Collection col = new ArrayList();
		//��Ҫ�������ȼ�����Ҫ��ȡ�����ݵĿ�ʼ�����ͽ�������
		int start = (pageNum-1)*pageShow;
		int end = start + pageShow-1;
		//����start�ı߽磬��С��0
		if(start < 0){
			start = 0;
		}
		//����end�ı߽磬�����������������
		if(end > this.pms.length-1){
			end = this.pms.length - 1;
		}
		//ÿ��ȡֵ���Ǵ�ͷ��ʼѭ������������indexΪ0
		index = 0;
		while(hasNext()  && index<=end){
			if(index >= start){
				col.add(pms[index]);
			}
			//���ѷ���������1
			index++;
		}
		return col;
	}
}

package com.bingo.code.example.design.iterator.rewrite;
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
	 * -1��ʾ�տ�ʼ��ʱ�򣬵�����ָ��ۺ϶����һ������֮ǰ
	 */
	private int index = -1;
	
	public ArrayIteratorImpl(SalaryManager aggregate){
		this.aggregate = aggregate;
	}
	
	
	public void first(){
		index = 0;
	}
	public void next(){
		if(index < this.aggregate.size()){
			index = index + 1;
		}
	}
	public boolean isDone(){
		if(index == this.aggregate.size()){
			return true;
		}
		return false;
	}
	public Object currentItem(){
		return this.aggregate.get(index);
	}
}

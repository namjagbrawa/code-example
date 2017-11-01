package com.bingo.code.example.design.iterator.module;

/**
 * ����ľۺ϶���ʵ�ִ�����Ӧ����������Ĺ���
 */
public class ConcreteAggregate extends Aggregate {
	/**
	 * ʾ�⣬��ʾ�ۺ϶�����������
	 */
	private String[] ss = null;
	
	/**
	 * ���췽��������ۺ϶�����������
	 * @param ss �ۺ϶�����������
	 */
	public ConcreteAggregate(String[] ss){
		this.ss = ss;
	}
	
	public Iterator createIterator() {
		//ʵ�ִ���Iterator�Ĺ�������
		return new ConcreteIterator(this);
	}
	/**
	 * ��ȡ��������Ӧ��Ԫ��
	 * @param index ����
	 * @return ��������Ӧ��Ԫ��
	 */
	public Object get(int index){
		Object retObj = null;
		if(index < ss.length){
			retObj = ss[index];
		}
		return retObj;
	}
	/**
	 * ��ȡ�ۺ϶���Ĵ�С
	 * @return �ۺ϶���Ĵ�С
	 */
	public int size(){
		return this.ss.length;
	}
}


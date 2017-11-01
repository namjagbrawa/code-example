package com.bingo.code.example.design.iterator.twoway;
/**
 * �������ӿڣ�������ʺͱ���Ԫ�صĲ�����ʵ��˫�����
 */
public interface Iterator {
	/**
	 * �ƶ����ۺ϶���ĵ�һ��λ��
	 */
	public void first();
	/**
	 * �ƶ����ۺ϶������һ��λ��
	 */
	public void next();
	/**
	 * �ж��Ƿ��Ѿ��ƶ��ۺ϶�������һ��λ��
	 * @return true��ʾ�Ѿ��ƶ��ۺ϶�������һ��λ�ã�
	 *         false��ʾ��û���ƶ����ۺ϶�������һ��λ��
	 */
	public boolean isDone();
	/**
	 * ��ȡ�����ĵ�ǰԪ��
	 * @return �����ĵ�ǰԪ��
	 */
	public Object currentItem();
	
	
	/**
	 * �ж��Ƿ�Ϊ��һ��Ԫ��
	 * @return ���Ϊ��һ��Ԫ�أ�����true�����򷵻�false
	 */
	public boolean isFirst();
	/**
	 * �ƶ����ۺ϶������һ��λ��
	 */
	public void previous();
}

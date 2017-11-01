package com.bingo.code.example.design.iterator.orderpage;
import java.util.*;
/**
 * ���巭ҳ���ʾۺ�Ԫ�صĵ����ӿ�
 */
public interface AggregationIterator {
	/**
	 * �ж��Ƿ�����һ��Ԫ�أ�����ν�Ƿ�һҳ�����ݣ�
	 * ��Ϊ�������ֻ��һ�����ݣ�Ҳ��Ҫ��һҳ��
	 * @return �������һ��Ԫ�أ�����true��û����һ��Ԫ�ؾͷ���false
	 */
	public boolean hasNext();
	/**
	 * ȡ�����漸��Ԫ��
	 * @param num ��Ҫ��ȡ�ļ�¼����
	 * @return ���漸��Ԫ��
	 */
	public Collection next(int num);
	/**
	 * �ж��Ƿ�����һ��Ԫ�أ�����ν�Ƿ�һҳ�����ݣ�
	 * ��Ϊ�������ֻ��һ�����ݣ�Ҳ��Ҫ��һҳ��
	 * @return �������һ��Ԫ�أ�����true��û����һ��Ԫ�ؾͷ���false
	 */
	public boolean hasPrevious();
	/**
	 * ȡ�����漸��Ԫ��
	 * @param num ��Ҫ��ȡ�ļ�¼����
	 * @return ���漸��Ԫ��
	 */
	public Collection previous(int num);
}

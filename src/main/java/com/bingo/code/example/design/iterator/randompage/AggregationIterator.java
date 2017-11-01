package com.bingo.code.example.design.iterator.randompage;
import java.util.*;
/**
 * ���������ҳ���ʾۺ�Ԫ�صĵ����ӿ�
 */
public interface AggregationIterator {
	/**
	 * �ж��Ƿ�����һ��Ԫ�أ�����ν�Ƿ�һҳ�����ݣ�
	 * ��Ϊ�������ֻ��һ�����ݣ�Ҳ��Ҫ��һҳ��
	 * @return �������һ��Ԫ�أ�����true��û����һ��Ԫ�ؾͷ���false
	 */
	public boolean hasNext();	
	/**
	 * �ж��Ƿ�����һ��Ԫ�أ�����ν�Ƿ�һҳ�����ݣ�
	 * ��Ϊ�������ֻ��һ�����ݣ�Ҳ��Ҫ��һҳ��
	 * @return �������һ��Ԫ�أ�����true��û����һ��Ԫ�ؾͷ���false
	 */
	public boolean hasPrevious();
	/**
	 * ȡ��ָ��ҳ��������
	 * @param pageNum Ҫ��ȡ��ҳ��
	 * @param pageShow ÿҳ��ʾ����������
	 * @return ָ��ҳ��������
	 */
	public Collection getPage(int pageNum, int pageShow);
}

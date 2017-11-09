package com.bingo.code.example.design.decorator.rewrite;
import java.util.*;
/**
 * ���㽱�������ӿ�
 */
public abstract class Component {
	/**
	 * ����ĳ����ĳ��ʱ���ڵĽ�����Щ��������ʾ�в�����ʹ�ã�
	 * ������ʵ��ҵ��ʵ�����ǻ��õģ�Ϊ�˱�ʾ���Ǹ������ҵ�񷽷���
	 * �����Щ������������
	 * @param user �����㽱�����Ա
	 * @param begin ���㽱��Ŀ�ʼʱ��
	 * @param end ���㽱��Ľ���ʱ��
	 * @return ĳ����ĳ��ʱ���ڵĽ���
	 */
	public abstract double calcPrize(String user,Date begin,Date end);
}

package com.bingo.code.example.design.decorator.rewrite;

import java.util.Date;

/**
 * װ�����Ľӿڣ���Ҫ����װ�εĶ���ʵ��ͬ���Ľӿ�
 */
public abstract class Decorator extends Component{
	/**
	 * ���б�װ�ε��������
	 */
	protected Component c;
	/**
	 * ͨ�����췽�����뱻װ�εĶ���
	 * @param c��װ�εĶ���
	 */
	public Decorator(Component c){
		this.c = c;
	}

	public double calcPrize(String user, Date begin, Date end) {
		//ת���������ķ���
		return c.calcPrize(user, begin, end);
	}
}

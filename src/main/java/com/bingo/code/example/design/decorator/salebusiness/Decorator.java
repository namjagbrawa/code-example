package com.bingo.code.example.design.decorator.salebusiness;
/**
 * װ�����Ľӿڣ���Ҫ����װ�εĶ���ʵ��ͬ���Ľӿ�
 */
public abstract class Decorator implements GoodsSaleEbi{
	/**
	 * ���б�װ�ε��������
	 */
	protected GoodsSaleEbi ebi;
	/**
	 * ͨ�����췽�����뱻װ�εĶ���
	 * @param ebi��װ�εĶ���
	 */
	public Decorator(GoodsSaleEbi ebi){
		this.ebi = ebi;
	}
}

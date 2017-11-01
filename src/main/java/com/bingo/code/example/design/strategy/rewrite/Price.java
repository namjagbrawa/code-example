package com.bingo.code.example.design.strategy.rewrite;
/**
 * �۸������Ҫ��ɼ�����ͻ������۸�Ĺ���
 */
public class Price {
	/**
	 * ����һ������Ĳ��Զ���
	 */
	private Strategy strategy = null;
	/**
	 * ���췽��������һ������Ĳ��Զ���
	 * @param aStrategy ����Ĳ��Զ���
	 */
	public Price(Strategy aStrategy){
		this.strategy = aStrategy;
	}	
	/**
	 * ���ۣ�����Կͻ��ı���
	 * @param goodsPrice ��Ʒ����ԭ��
	 * @return ��������ģ�Ӧ�ø��ͻ����ļ۸�
	 */
	public double quote(double goodsPrice){
		return this.strategy.calcPrice(goodsPrice);
	}
}

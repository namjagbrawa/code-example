package com.bingo.code.example.design.strategy.improvement;
/**
 * �۸������Ҫ��ɼ�����ͻ������۸�Ĺ���
 */
public class Price {
	/**
	 * ���ۣ��Բ�ͬ���͵ģ����㲻ͬ�ļ۸�
	 * @param goodsPrice ��Ʒ����ԭ��
	 * @param customerType �ͻ�����
	 * @return ��������ģ�Ӧ�ø��ͻ����ļ۸�
	 */
	public double quote(double goodsPrice,String customerType){
		if("��ͨ�ͻ�".equals(customerType)){
			return this.calcPriceForNormal(goodsPrice);
		}else if("�Ͽͻ�".equals(customerType)){
			return this.calcPriceForOld(goodsPrice);
		}else if("��ͻ�".equals(customerType)){
			return this.calcPriceForLarge(goodsPrice);		
		}
		//������Ա���Ǳ�ԭ��
		return goodsPrice;
	}
	/**
	 * Ϊ�¿ͻ���������ͨ�ͻ�����Ӧ���ļ۸�
	 * @param goodsPrice ��Ʒ����ԭ��
	 * @return ��������ģ�Ӧ�ø��ͻ����ļ۸�
	 */
	private double calcPriceForNormal(double goodsPrice){
		System.out.println("�����¿ͻ���������ͨ�ͻ���û���ۿ�");
		return goodsPrice;
	}
	/**
	 * Ϊ�Ͽͻ�����Ӧ���ļ۸�
	 * @param goodsPrice ��Ʒ����ԭ��
	 * @return ��������ģ�Ӧ�ø��ͻ����ļ۸�
	 */
	private double calcPriceForOld(double goodsPrice){
		System.out.println("�����Ͽͻ���ͳһ�ۿ�5%");
		return goodsPrice*(1-0.05);
	}
	/**
	 * Ϊ��ͻ�����Ӧ���ļ۸�
	 * @param goodsPrice ��Ʒ����ԭ��
	 * @return ��������ģ�Ӧ�ø��ͻ����ļ۸�
	 */
	private double calcPriceForLarge(double goodsPrice){
		System.out.println("���ڴ�ͻ���ͳһ�ۿ�10%");
		return goodsPrice*(1-0.1);	
	}
}

package com.bingo.code.example.design.strategy.design;
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
			System.out.println("�����¿ͻ���������ͨ�ͻ���û���ۿ�");
			return goodsPrice;
		}else if("�Ͽͻ�".equals(customerType)){
			System.out.println("�����Ͽͻ���ͳһ�ۿ�5%");
			return goodsPrice*(1-0.05);
		}else if("��ͻ�".equals(customerType)){
			System.out.println("���ڴ�ͻ���ͳһ�ۿ�10%");
			return goodsPrice*(1-0.1);			
		}
		//������Ա���Ǳ�ԭ��
		return goodsPrice;
	}
}

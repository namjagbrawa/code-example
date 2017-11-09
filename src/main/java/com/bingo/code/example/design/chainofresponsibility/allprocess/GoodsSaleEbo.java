package com.bingo.code.example.design.chainofresponsibility.allprocess;

/**
 * ��Ʒ���۹���ģ���ҵ����
 */
public class GoodsSaleEbo {
	/**
	 * ����������Ϣ��������������Ӧ���Ƕ�����̫�鷳�ˣ�Ϊ����ʾ���򵥵�
	 * @param user ������Ա
	 * @param customer �ͻ�
	 * @param saleModel ��������
	 * @return �Ƿ񱣴�ɹ�
	 */
	public boolean sale(String user,String customer,SaleModel saleModel){
		//���ȫ�������ﴦ��������˳����
		//1��Ȩ�޼��
		//2��ͨ�����ݼ�飨���Ҳ�����ڱ��ֲ��Ѿ������ˣ�
		//3�������߼�У��
		
		//4��������ҵ����
		
		//��������ͨ���������������������Ҫ���𹹽���
		SaleSecurityCheck ssc = new SaleSecurityCheck();
		SaleDataCheck sdc = new SaleDataCheck();
		SaleLogicCheck slc = new SaleLogicCheck();
		SaleMgr sd = new SaleMgr();
		ssc.setSuccessor(sdc);
		sdc.setSuccessor(slc);
		slc.setSuccessor(sd);
		//�����ϵĵ�һ�����󷢳����������
		return ssc.sale(user, customer, saleModel);
	}
}

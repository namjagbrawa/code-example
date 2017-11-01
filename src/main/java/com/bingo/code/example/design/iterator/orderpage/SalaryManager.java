package com.bingo.code.example.design.iterator.orderpage;


/**
 * ���ͻ����չ����Ǹ���˾�Ĺ��ʹ�����
 */
public class SalaryManager{
	/**
	 * ���������
	 */
	private PayModel[] pms = null;
	/**
	 * ��ȡ�����б�
	 * @return �����б�
	 */
	public PayModel[] getPays(){
		return pms;
	}
	
	/**
	 * ���㹤�ʣ���ʵӦ���кܶ������Ϊ����ʾ�Ӽ�
	 */
	public void calcSalary(){
		//���㹤�ʣ����ѹ�����Ϣ��䵽�����б�����
		//Ϊ�˲��ԣ���������ݽ�ȥ
		PayModel pm1 = new PayModel();
		pm1.setPay(2200);
		pm1.setUserName("����");
		
		PayModel pm2 = new PayModel();
		pm2.setPay(3600);
		pm2.setUserName("����");
		
		PayModel pm3 = new PayModel();
		pm3.setPay(2200);
		pm3.setUserName("�������");
		
		PayModel pm4 = new PayModel();
		pm4.setPay(3600);
		pm4.setUserName("��������");
		
		PayModel pm5 = new PayModel();
		pm5.setPay(2200);
		pm5.setUserName("��������");
		
		pms = new PayModel[5];
		pms[0] = pm1;
		pms[1] = pm2;
		pms[2] = pm3;
		pms[3] = pm4;
		pms[4] = pm5;
	}

	public AggregationIterator createIterator() {
		return new ArrayIteratorImpl(this);
	}
}
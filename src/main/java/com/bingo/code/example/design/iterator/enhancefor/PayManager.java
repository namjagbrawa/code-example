package com.bingo.code.example.design.iterator.enhancefor;
import java.util.*;
/**
 * �ͻ������еĹ��ʹ������
 */
public class PayManager{
	private List<PayModel> list = new ArrayList<PayModel>();
	/**
	 * ��ȡ�����б�
	 * @return �����б�
	 */
	public List<PayModel> getPayList(){
		return list;
	}
	/**
	 * ���㹤�ʣ���ʵӦ���кܶ������Ϊ����ʾ�Ӽ�
	 */
	public void calcPay(){
		//���㹤�ʣ����ѹ�����Ϣ��䵽�����б�����
		//Ϊ�˲��ԣ���������ݽ�ȥ
		PayModel pm1 = new PayModel();
		pm1.setPay(3800);
		pm1.setUserName("����");
		
		PayModel pm2 = new PayModel();
		pm2.setPay(5800);
		pm2.setUserName("����");
		
		list.add(pm1);
		list.add(pm2);
	}
}

package com.bingo.code.example.design.iterator.enhancefor;
import java.util.*;
public class Client {
	public static void main(String[] args) {
		//���ʼ��ŵĹ����б�
		PayManager payManager= new PayManager();
		//�ȼ����ٻ�ȡ
		payManager.calcPay();
		Collection<PayModel> payList = payManager.getPayList();
		System.out.println("���Ź����б�");
//		Iterator it = payList.iterator();
//		while(it.hasNext()){
//			PayModel pm = (PayModel)it.next();
//			System.out.println(pm);
//		}
		for(PayModel pm : payList){
			System.out.println(pm);
		}
		//�������չ���˾�Ĺ����б�
		SalaryManager salaryManager = new SalaryManager();
		//�ȼ����ٻ�ȡ
		salaryManager.calcSalary();
		PayModel[] pms = salaryManager.getPays();
		System.out.println("���չ��Ĺ�˾�����б�");
//		for(int i=0;i<pms.length;i++){
//			System.out.println(pms[i]);
//		}
		for(PayModel pm : pms){
			System.out.println(pm);
		}
	}
}

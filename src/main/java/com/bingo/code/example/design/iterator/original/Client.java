package com.bingo.code.example.design.iterator.original;
import java.util.*;
public class Client {
	public static void main(String[] args) {
		//���ʼ��ŵĹ����б�
		PayManager payManager= new PayManager();
		//�ȼ����ٻ�ȡ
		payManager.calcPay();
		Collection payList = payManager.getPayList();
		Iterator it = payList.iterator();
		System.out.println("���Ź����б�");
		while(it.hasNext()){
			PayModel pm = (PayModel)it.next();
			System.out.println(pm);
		}
		
		//�������չ���˾�Ĺ����б�
		SalaryManager salaryManager = new SalaryManager();
		//�ȼ����ٻ�ȡ
		salaryManager.calcSalary();
		PayModel[] pms = salaryManager.getPays();
		System.out.println("���չ��Ĺ�˾�����б�");
		for(int i=0;i<pms.length;i++){
			System.out.println(pms[i]);
		}
	}
}

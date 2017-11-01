package com.bingo.code.example.design.iterator.randompage;
import java.util.*;
public class Client {
	public static void main(String[] args) {
		//�������չ���˾�Ĺ����б�
		SalaryManager salaryManager = new SalaryManager();
		//�ȼ����ٻ�ȡ
		salaryManager.calcSalary();
		//�õ���ҳ������
		AggregationIterator it = salaryManager.createIterator();
		
		//��ȡ��һҳ��ÿҳ��ʾ2��
		Collection col = it.getPage(1,2);
		System.out.println("��һҳ���ݣ�");
		print(col);
		//��ȡ�ڶ�ҳ��ÿҳ��ʾ2��
		Collection col2 = it.getPage(2,2);
		System.out.println("�ڶ�ҳ���ݣ�");
		print(col2);
		//�ٴλ�ȡ��һҳ
		Collection col3 = it.getPage(1,2);
		System.out.println("�ٴλ�ȡ��һҳ���ݣ�");
		print(col3);
		//��ȡ����ҳ
		Collection col4 = it.getPage(3,2);
		System.out.println("��ȡ����ҳ���ݣ�");
		print(col4);
	}
	private static void print(Collection col){
		Iterator it = col.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			System.out.println(obj);
		}		
	}
}

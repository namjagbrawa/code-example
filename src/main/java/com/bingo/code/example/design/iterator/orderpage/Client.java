package com.bingo.code.example.design.iterator.orderpage;
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
		Collection col = it.next(2);
		System.out.println("��һҳ���ݣ�");
		print(col);
		//��ȡ�ڶ�ҳ��ÿҳ��ʾ2��
		Collection col2 = it.next(2);
		System.out.println("�ڶ�ҳ���ݣ�");
		print(col2);
		//��ǰһҳ��Ҳ�����ٴλ�ȡ�ڶ�ҳ
		Collection col3 = it.previous(2);
		System.out.println("�ٴλ�ȡ�ڶ�ҳ���ݣ�");
		print(col3);
	}
	private static void print(Collection col){
		Iterator it = col.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}

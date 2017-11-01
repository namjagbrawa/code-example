package com.bingo.code.example.design.iterator.twoway;

public class Client {
	public static void main(String[] args) {
		//�������չ���˾�Ĺ����б�
		SalaryManager salaryManager = new SalaryManager();
		//�ȼ����ٻ�ȡ
		salaryManager.calcSalary();
		
		//�õ�˫�������
		Iterator it = salaryManager.createIterator();
		//�������õ���������һ��Ԫ��
		it.first();
		
		//��nextһ��
		if(!it.isDone()){
			PayModel pm = (PayModel)it.currentItem();
			System.out.println("next1 == "+pm);
			//���µ���һ��
			it.next();
		}
		//Ȼ��previousһ��
		if(!it.isFirst()){
			//��ǰ����һ��
			it.previous();
			PayModel pm = (PayModel)it.currentItem();
			System.out.println("previous1 == "+pm);			
		}
		//��nextһ��
		if(!it.isDone()){
			PayModel pm = (PayModel)it.currentItem();
			System.out.println("next2 == "+pm);
			//���µ���һ��
			it.next();
		}
		//����nextһ��
		if(!it.isDone()){
			PayModel pm = (PayModel)it.currentItem();
			System.out.println("next3 == "+pm);
			//���µ���һ��
			it.next();
		}
		//Ȼ��previousһ��
		if(!it.isFirst()){
			//��ǰ����һ��
			it.previous();
			PayModel pm = (PayModel)it.currentItem();
			System.out.println("previous2 == "+pm);			
		}
		
	}
}

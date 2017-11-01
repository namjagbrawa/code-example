package com.bingo.code.example.design.templatemethod.compare;
import java.util.*;
public class Client {
	public static void main(String[] args) {
		//׼��Ҫ���Ե�����
		UserModel um1 = new UserModel("u1","user1",23);
		UserModel um2 = new UserModel("u2","user2",22);
		UserModel um3 = new UserModel("u3","user3",21);
		UserModel um4 = new UserModel("u4","user4",24);
		//��ӵ��б���
		List<UserModel> list = new ArrayList<UserModel>();
		list.add(um1);
		list.add(um2);
		list.add(um3);
		list.add(um4);
		
		System.out.println("����ǰ---------------------��");
		printList(list);
		//ʵ�ֱȽ�����Ҳ���Ե�����һ������ʵ��
		Comparator c = new Comparator(){
			public int compare(Object obj1, Object obj2) {
				//����ʵ�ְ���������������
				UserModel tempUm1 = (UserModel)obj1;
				UserModel tempUm2 = (UserModel)obj2;
				if(tempUm1.getAge() > tempUm2.getAge()){
					return 1;
				}else if(tempUm1.getAge() == tempUm2.getAge()){
					return 0;
				}else if(tempUm1.getAge() < tempUm2.getAge()){
					return -1;
				}
				return 0;
			}};
		
			//����	
		Collections.sort(list,c);
		
		System.out.println("�����---------------------��");
		printList(list);
		
	}
	private static void printList(List<UserModel> list){
		for(UserModel um : list){
			System.out.println(um);
		}
	}
}
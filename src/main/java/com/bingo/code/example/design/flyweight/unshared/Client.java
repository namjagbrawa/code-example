package com.bingo.code.example.design.flyweight.unshared;

public class Client {
	public static void main(String[] args) throws Exception{
		//��Ҫ�ȵ�¼��Ȼ�����ж��Ƿ���Ȩ��
		SecurityMgr mgr = SecurityMgr.getInstance();
		mgr.login("����");
		mgr.login("����");		
		boolean f1 = mgr.hasPermit("����","н������","�鿴");
		boolean f2 = mgr.hasPermit("����","н������","�鿴");
		boolean f3 = mgr.hasPermit("����","н������","�޸�");
		
		System.out.println("f1=="+f1);
		System.out.println("f2=="+f2);
		System.out.println("f3=="+f3);
		
		for(int i=0;i<3;i++){
			mgr.login("����"+i);
			mgr.hasPermit("����"+i,"н������","�鿴");
		}
	}
}

package com.bingo.code.example.design.flyweight.clearcache;

public class Client {
	public static void main(String[] args) throws Exception{
		SecurityMgr mgr = SecurityMgr.getInstance();
		boolean f1 = mgr.hasPermit("����","н������","�鿴");
		boolean f2 = mgr.hasPermit("����","н������","�鿴");
		boolean f3 = mgr.hasPermit("����","н������","�޸�");

//		Thread.sleep(4000);
		for(int i=0;i<3;i++){
			mgr.hasPermit("����"+i,"н������","�鿴");
		}	
		
		//�ر����ѣ�����鿴�����ô���������ָ����ʹ�õĴ���
		//ָ����SecurityMgr��queryByUser����ͨ����Ԫ����ȥ��ȡ��Ԫ����Ĵ���
		System.out.println("н������,�鿴 ��������"+FlyweightFactory.getInstance().getUseTimes("н������,�鿴")+"��");
		System.out.println("н������,�޸� ��������"+FlyweightFactory.getInstance().getUseTimes("н������,�޸�")+"��");
		System.out.println("��Ա�б�,�鿴 ��������"+FlyweightFactory.getInstance().getUseTimes("��Ա�б�,�鿴")+"��");
	}
}

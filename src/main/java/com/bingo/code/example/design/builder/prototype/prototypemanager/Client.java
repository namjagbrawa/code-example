package com.bingo.code.example.design.builder.prototype.prototypemanager;

public class Client {
	public static void main(String[] args) {
		try {
			// ��ʼ��ԭ�͹�����
			Prototype p1 = new ConcretePrototype1();
			PrototypeManager.setPrototype("Prototype1", p1);

			// ��ȡԭ������������
			Prototype p3 = PrototypeManager.getPrototype("Prototype1").clone();
			p3.setName("p3");
			System.out.println("p3" + p3);

			// ���˶�̬���л���ʵ��
			Prototype p2 = new ConcretePrototype2();
			PrototypeManager.setPrototype("Prototype1", p2);

			// ���»�ȡԭ������������
			Prototype p4 = PrototypeManager.getPrototype("Prototype1").clone();
			p4.setName("p4");
			System.out.println("p4" + p4);

			// ����ע�������ԭ��
			PrototypeManager.removePrototype("Prototype1");

			// �ٴλ�ȡԭ������������
			Prototype p5 = PrototypeManager.getPrototype("Prototype1").clone();
			p5.setName("p5");
			System.out.println("p5" + p5);
		} catch (Exception err) {
			System.err.println(err.getMessage());
		}
	}
}
package com.bingo.code.example.design.observer.watcher;

public class Client {
	public static void main(String[] args) {
		//����ˮ���������
		WaterQuality subject = new WaterQuality();
		//���������۲���
		WatcherObserver watcher1 = new Watcher();
		watcher1.setJob("�����Ա");
		WatcherObserver watcher2 = new Watcher();
		watcher2.setJob("Ԥ����Ա");
		WatcherObserver watcher3 = new Watcher();
		watcher3.setJob("��ⲿ���쵼");
		//ע��۲���
		subject.attach(watcher1);
		subject.attach(watcher2);
		subject.attach(watcher3);
		
		//��дˮ�ʱ���
		System.out.println("��ˮ��Ϊ������ʱ��------------------��");
		subject.setPolluteLevel(0);
		System.out.println("��ˮ��Ϊ�����Ⱦ��ʱ��---------------��");
		subject.setPolluteLevel(1);
		System.out.println("��ˮ��Ϊ�ж���Ⱦ��ʱ��---------------��");
		subject.setPolluteLevel(2);
	}
}

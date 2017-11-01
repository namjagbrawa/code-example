package com.bingo.code.example.design.mediator.module;
/**
 * �����ͬ����A
 */
public class ConcreteColleagueA extends Colleague {
	public ConcreteColleagueA(Mediator mediator) {
		super(mediator);
	}
	/**
	 * ʾ�ⷽ����ִ��ĳЩҵ����
	 */
	public void someOperation() {
		//����Ҫ������ͬ��ͨ�ŵ�ʱ��֪ͨ�н��߶���
		getMediator().changed(this);
	}
}
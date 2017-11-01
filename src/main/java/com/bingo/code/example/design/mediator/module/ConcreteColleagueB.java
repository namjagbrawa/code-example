package com.bingo.code.example.design.mediator.module;
/**
 * �����ͬ����B
 */
public class ConcreteColleagueB extends Colleague {
	public ConcreteColleagueB(Mediator mediator) {
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


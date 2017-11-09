package com.bingo.code.example.design.memento.rewrite;


/**
 * ���𱣴�ģ����������A�Ķ���ı���¼����
 */
public class FlowAMementoCareTaker {
	/**
	 * ��¼������ı���¼����
	 */
	private FlowAMockMemento memento = null;
	/**
	 * ���汸��¼����
	 * @param memento ������ı���¼����
	 */
	public void saveMemento(FlowAMockMemento memento){
		this.memento = memento;
	}
	/**
	 * ��ȡ������ı���¼����
	 * @return ������ı���¼����
	 */
	public FlowAMockMemento retriveMemento(){
		return this.memento;
	}
}

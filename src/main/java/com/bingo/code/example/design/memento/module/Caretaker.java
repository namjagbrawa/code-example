package com.bingo.code.example.design.memento.module;

/**
 * ���𱣴汸��¼�Ķ���
 */
public class Caretaker{
	/**
	 * ��¼������ı���¼����
	 */
	private Memento memento = null;
	/**
	 * ���汸��¼����
	 * @param memento ������ı���¼����
	 */
	public void saveMemento(Memento memento){
		this.memento = memento;
	}
	/**
	 * ��ȡ������ı���¼����
	 * @return ������ı���¼����
	 */
	public Memento retriveMemento(){
		return this.memento;
	}
}


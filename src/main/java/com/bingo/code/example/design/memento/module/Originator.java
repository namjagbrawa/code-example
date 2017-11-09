package com.bingo.code.example.design.memento.module;

/**
 * ԭ��������
 */
public class Originator {
	/**
	 * ʾ�⣬��ʾԭ������״̬
	 */
	private String state = "";
	/**
	 * ��������ԭ���������״̬�ı���¼����
	 * @return �����õı���¼����
	 */
	public Memento createMemento() {
		return new MementoImpl(state);
	}
	/**
	 * ��������ԭ���������״̬������ص�����¼�����¼��״̬
	 * @param memento ��¼��ԭ����״̬�ı���¼����
	 */
	public void setMemento(Memento memento) {
		MementoImpl mementoImpl = (MementoImpl)memento;
		this.state = mementoImpl.getState();
	}
	/**
	 * �����ı���¼����ʵ�ֱ���¼խ�ӿ�
	 * ʵ�ֳ�˽�е��ڲ��࣬�����ⲿ����
	 */
	private static class MementoImpl implements Memento{
		/**
		 * ʾ�⣬��ʾ��Ҫ�����״̬
		 */
		private String state = "";
		public MementoImpl(String state){
			this.state = state;
		}
		public String getState() {
			return state;
		}
	}

}


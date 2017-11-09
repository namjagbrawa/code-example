package com.bingo.code.example.design.memento.rewrite;

import java.io.Serializable;

/**
 * ģ����������A��ֻ��һ��ʾ�⣬��ָĳ����������
 */
public class FlowAMock implements Serializable {
	/**
	 * �������ƣ�����Ҫ�ⲿ�洢��״̬����
	 */
	private String flowName;
	/**
	 * ʾ�⣬��ָĳ���м�������Ҫ�ⲿ�洢��״̬����
	 */
	private int tempResult;
	/**
	 * ʾ�⣬��ָĳ���м�������Ҫ�ⲿ�洢��״̬����
	 */
	private String tempState;
	/**
	 * ���췽����������������
	 * @param flowName ��������
	 */
	public FlowAMock(String flowName){
		this.flowName = flowName;
	}
	/**
	 * ʾ�⣬�������̵ĵ�һ���׶�
	 */
	public void runPhaseOne(){
		//������׶Σ����ܲ������м�����ʾ��һ��
		tempResult = 3;
		tempState = "PhaseOne";
	}
	/**
	 * ʾ�⣬���շ���һ���������̺�벿��
	 */
	public void schema1(){
		//ʾ�⣬��Ҫʹ�õ�һ���׶β���������
		this.tempState += ",Schema1";
		System.out.println(this.tempState + " : now run "+tempResult);
		this.tempResult += 11;
	}
	/**
	 * ʾ�⣬���շ��������������̺�벿��
	 */
	public void schema2(){
		//ʾ�⣬��Ҫʹ�õ�һ���׶β���������
		this.tempState += ",Schema2";
		System.out.println(this.tempState + " : now run "+tempResult);
		this.tempResult += 22;
	}	
	/**
	 * ��������ԭ���������״̬�ı���¼����
	 * @return �����õı���¼����
	 */
	public FlowAMockMemento createMemento() {
		return new MementoImpl(this.tempResult,this.tempState);
	}
	/**
	 * ��������ԭ���������״̬������ص�����¼�����¼��״̬
	 * @param memento ��¼��ԭ����״̬�ı���¼����
	 */
	public void setMemento(FlowAMockMemento memento) {
		MementoImpl mementoImpl = (MementoImpl)memento;
		this.tempResult = mementoImpl.getTempResult();
		this.tempState = mementoImpl.getTempState();
	}
	/**
	 * �����ı���¼����ʵ�ֱ���¼խ�ӿ�
	 * ʵ�ֳ�˽�е��ڲ��࣬�����ⲿ����
	 */
	private static class MementoImpl implements FlowAMockMemento{
		/**
		 * ʾ�⣬����ĳ���м���
		 */
		private int tempResult;
		/**
		 * ʾ�⣬����ĳ���м���
		 */
		private String tempState;
		public MementoImpl(int tempResult,String tempState){
			this.tempResult = tempResult;
			this.tempState = tempState;
		}
		public int getTempResult() {
			return tempResult;
		}
		public String getTempState() {
			return tempState;
		}
	}
}

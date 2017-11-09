package com.bingo.code.example.design.memento.rewrite;

/**
 * ģ����������A��ֻ��һ��ʾ�⣬��ָĳ����������
 */
public class FlowAMockPrototype implements Cloneable {
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
	public FlowAMockPrototype(String flowName){
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
		try {
			return new MementoImplPrototype((FlowAMockPrototype) this.clone());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * ��������ԭ���������״̬������ص�����¼�����¼��״̬
	 * @param memento ��¼��ԭ����״̬�ı���¼����
	 */
	public void setMemento(FlowAMockMemento memento) {
		MementoImplPrototype mementoImpl = (MementoImplPrototype)memento;
		this.tempResult = mementoImpl.getFlowAMock().tempResult;
		this.tempState = mementoImpl.getFlowAMock().tempState;
	}
	/**
	 * �����ı���¼����ʵ�ֱ���¼խ�ӿ�
	 * ʵ�ֳ�˽�е��ڲ��࣬�����ⲿ����
	 */
	private static class MementoImplPrototype implements FlowAMockMemento{
		private FlowAMockPrototype flowAMock = null;
		
		public MementoImplPrototype(FlowAMockPrototype f){
			this.flowAMock = f;
		}

		public FlowAMockPrototype getFlowAMock() {
			return flowAMock;
		}
	}
}

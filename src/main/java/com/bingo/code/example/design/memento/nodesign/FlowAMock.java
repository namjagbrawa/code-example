package com.bingo.code.example.design.memento.nodesign;
/**
 * ģ����������A��ֻ��һ��ʾ�⣬��ָĳ����������
 */
public class FlowAMock {
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
	
	public String getTempState() {
		return tempState;
	}
	public void setTempState(String tempState) {
		this.tempState = tempState;
	}
	public int getTempResult() {
		return tempResult;
	}
	public void setTempResult(int tempResult) {
		this.tempResult = tempResult;
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
}

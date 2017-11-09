package com.bingo.code.example.design.state.leaverequest;
/**
 * ����״̬�ӿ�
 */
public interface State {
	/**
	 * ִ��״̬��Ӧ�Ĺ��ܴ���
	 * @param ctx �����ĵ�ʵ������
	 */
	public void doWork(StateMachine ctx);
}

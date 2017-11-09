package com.bingo.code.example.design.state.leaverequest;

/**
 * ������˽�������
 */
public class AuditOverState implements LeaveRequestState{
	public void doWork(StateMachine request) {
		//�Ȱ�ҵ��������ͻ���
		LeaveRequestModel lrm = (LeaveRequestModel)request.getBusinessVO();

		//ҵ���������������¼�������̽���		
	}
}

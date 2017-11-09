package com.bingo.code.example.design.state.leaverequestcomplete;

/**
 * ������˽�������
 */
public class AuditOverState implements LeaveRequestState{
	public void doWork(StateMachine request) {
		//�Ȱ�ҵ��������ͻ���
		LeaveRequestModel lrm = (LeaveRequestModel)request.getBusinessVO();
		System.out.println(lrm.getUser()+"�������������Ѿ���˽���������ǣ�"+lrm.getResult());
	}
}

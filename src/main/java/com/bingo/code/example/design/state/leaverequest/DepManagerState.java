package com.bingo.code.example.design.state.leaverequest;

/**
 * �����ž������ˣ�������Ӧ��˽���״̬
 */
public class DepManagerState implements LeaveRequestState{
	public void doWork(StateMachine request) {
		//�Ȱ�ҵ��������ͻ���
		LeaveRequestModel lrm = (LeaveRequestModel)request.getBusinessVO();

		//ҵ��������˽�����浽���ݿ���
		
		//���ž�����˹���ֱ��ת����˽���״̬��
		request.setState(new AuditOverState());

		//������������һ�������������쿴��˽��
	}
}

package com.bingo.code.example.design.state.leaverequestcomplete;

import java.util.Scanner;

/**
 * �����ž������ˣ�������Ӧ��˽���״̬
 */
public class DepManagerState implements LeaveRequestState{
	public void doWork(StateMachine request) {
		//�Ȱ�ҵ��������ͻ���
		LeaveRequestModel lrm = (LeaveRequestModel)request.getBusinessVO();
		System.out.println("���ž�������У����Ժ�......");
		
		//ģ���û�������棬ͨ������̨����ȡ����
		System.out.println(lrm.getUser()+"�����"+lrm.getBeginDate()+
		"��ʼ���"+lrm.getLeaveDays()+"��,�벿�ž������(1Ϊͬ�⣬2Ϊ��ͬ��)��");
		//��ȡ�ӿ���̨���������
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNext()){
			int a = scanner.nextInt();
			//���ûص���������
			String result = "��ͬ��";
			if(a==1){
				result = "ͬ��";
			}
			lrm.setResult("���ž�����˽����"+result);
			//���ž�����˹���ֱ��ת����˽���״̬��
			request.setState(new AuditOverState());
			//����ִ����һ������
			request.doWork();
		}		
	}
}

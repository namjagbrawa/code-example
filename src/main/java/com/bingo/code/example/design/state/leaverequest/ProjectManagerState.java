package com.bingo.code.example.design.state.leaverequest;

/**
 * ������Ŀ�������ˣ��������ܶ�Ӧ���ž�����ˡ���˽���֮�е�һ��
 */
public class ProjectManagerState implements LeaveRequestState {
    public void doWork(StateMachine request) {
        //�Ȱ�ҵ��������ͻ���
        LeaveRequestModel lrm = (LeaveRequestModel) request.getBusinessVO();

        //ҵ��������˽�����浽���ݿ���

        //����ѡ��Ľ����������������һ��
        if ("ͬ��".equals(lrm.getResult())) {
            if (lrm.getLeaveDays() > 3) {
                //��������������3�죬������Ŀ����ͬ���ˣ����ύ�����ž���
                request.setState(new DepManagerState());

                //Ϊ���ž�������һ������
            } else {
                //3�����ڵ���٣�����Ŀ��������,�Ͳ����ύ�����ž����ˣ�ת����˽���״̬
                request.setState(new AuditOverState());

                //������������һ�������������쿴��˽��
            }
        } else {
            //��Ŀ����Ҫ�ǲ�ͬ��Ļ���Ҳ�Ͳ����ύ�����ž����ˣ�ת����˽���״̬
            request.setState(new AuditOverState());

            //������������һ�������������쿴��˽��
        }
    }
}
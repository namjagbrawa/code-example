package com.bingo.code.example.design.templatemethod.nodesignadmin;

/**
 * ������Ա��¼���Ƶ��߼�����
 */
public class WorkerLogin {
	/**
	 * �жϵ�¼�����Ƿ���ȷ��Ҳ�����Ƿ��ܵ�¼�ɹ�
	 * @param lm ��װ��¼���ݵ�Model
	 * @return true��ʾ��¼�ɹ���false��ʾ��¼ʧ��
	 */
	public boolean login(LoginModel lm) {
		//1�����ݹ�����Ա���ȥ��ȡ������Ա������
		WorkerModel wm = this.findWorkerByWorkerId(lm.getWorkerId());
		//2���жϴ�ǰ̨���ݹ������û����ͼ��ܺ���������ݣ������ݿ������е������Ƿ�ƥ��
		//���жϹ�����Ա�Ƿ���ڣ����wmΪnull��˵��������Ա�϶�������
		//���ǲ�Ϊnull��������Ա��һ�����ڣ�
		//��Ϊ���ݲ���ܷ���new WorkerModel();��˻���Ҫ����һ�����ж�
		if (wm != null) {
			//3���Ѵ�ǰ̨�������������ݣ�ʹ����Ӧ�ļ����㷨���м�������
			String encryptPwd = this.encryptPwd(lm.getPwd());
			//���������Ա���ڣ���鹤����Ա��ź������Ƿ�ƥ��
			if (wm.getWorkerId().equals(lm.getWorkerId())
					&& wm.getPwd().equals(encryptPwd)) {
				return true;
			}
		}
		return false;
	}
	/**
	 * ���������ݽ��м���
	 * @param pwd ��������
	 * @return ���ܺ����������
	 */
	private String encryptPwd(String pwd){
		//�����������м��ܣ�ʡ����
		return pwd;
	}
	/**
	 * ���ݹ�����Ա��Ż�ȡ������Ա����ϸ��Ϣ
	 * @param workerId ������Ա���
	 * @return ��Ӧ�Ĺ�����Ա����ϸ��Ϣ
	 */
	private WorkerModel findWorkerByWorkerId(String workerId) {
		// ����ʡ�Ծ���Ĵ�������ʾ�⣬����һ����Ĭ�����ݵĶ���
		WorkerModel wm = new WorkerModel();
		wm.setWorkerId(workerId);
		wm.setName("Worker1");
		wm.setPwd("worker1");
		wm.setUuid("Worker0001");
		return wm;
	}
}

package com.bingo.code.example.design.templatemethod.nodesignuser;

/**
 * ��ͨ�û���¼���Ƶ��߼�����
 */
public class NormalLogin {
	/**
	 * �жϵ�¼�����Ƿ���ȷ��Ҳ�����Ƿ��ܵ�¼�ɹ�
	 * @param lm ��װ��¼���ݵ�Model
	 * @return true��ʾ��¼�ɹ���false��ʾ��¼ʧ��
	 */
	public boolean login(LoginModel lm) {
		//1�������ݿ��ȡ��¼��Ա����Ϣ�� ���Ǹ����û����ȥ��ȡ��Ա������
		UserModel um = this.findUserByUserId(lm.getUserId());
		//2���жϴ�ǰ̨���ݹ����ĵ�¼���ݣ������ݿ������е������Ƿ�ƥ��
		//���ж��û��Ƿ���ڣ����umΪnull��˵���û��϶�������
		//���ǲ�Ϊnull���û���һ�����ڣ���Ϊ���ݲ���ܷ���new UserModel();
		//��˻���Ҫ����һ�����ж�
		if (um != null) {
			//����û����ڣ�����û���ź������Ƿ�ƥ��
			if (um.getUserId().equals(lm.getUserId())
					&& um.getPwd().equals(lm.getPwd())) {
				return true;
			}
		}
		return false;
	}
	/**
	 * �����û���Ż�ȡ�û�����ϸ��Ϣ
	 * @param userId �û����
	 * @return ��Ӧ���û�����ϸ��Ϣ
	 */
	private UserModel findUserByUserId(String userId) {
		// ����ʡ�Ծ���Ĵ�������ʾ�⣬����һ����Ĭ�����ݵĶ���
		UserModel um = new UserModel();
		um.setUserId(userId);
		um.setName("test");
		um.setPwd("test");
		um.setUuid("User0001");
		return um;
	}
}

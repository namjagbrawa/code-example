package com.bingo.code.example.design.templatemethod.rewrite;
/**
 *	��¼���Ƶ�ģ��
 */
public abstract class LoginTemplate {
	/**
	 * �жϵ�¼�����Ƿ���ȷ��Ҳ�����Ƿ��ܵ�¼�ɹ�
	 * @param lm ��װ��¼���ݵ�Model
	 * @return true��ʾ��¼�ɹ���false��ʾ��¼ʧ��
	 */
	public final boolean login(LoginModel lm){
		//1�����ݵ�¼��Ա�ı��ȥ��ȡ��Ӧ������
		LoginModel dbLm = this.findLoginUser(lm.getLoginId());
		if(dbLm!=null){
			//2����������м���
			String encryptPwd = this.encryptPwd(lm.getPwd());
			//�Ѽ��ܺ��������ûص���¼����ģ������
			lm.setPwd(encryptPwd);
			//3���ж��Ƿ�ƥ���
			return this.match(lm, dbLm);
		}
		return false;
	}
	/**
	 * ���ݵ�¼��������Һͻ�ȡ�洢����Ӧ������
	 * @param loginId ��¼���
	 * @return ��¼����ڴ洢�����Ӧ������
	 */
	public abstract LoginModel findLoginUser(String loginId);
	/**
	 * ���������ݽ��м���
	 * @param pwd ��������
	 * @return ���ܺ����������
	 */
	public String encryptPwd(String pwd){
		return pwd;
	}
	/**
	 * �ж��û���д�ĵ�¼���ݺʹ洢�ж�Ӧ�������Ƿ�ƥ�����
	 * @param lm �û���д�ĵ�¼����
	 * @param dbLm �ڴ洢�ж�Ӧ������
	 * @return true��ʾƥ��ɹ���false��ʾƥ��ʧ��
	 */
	public boolean match(LoginModel lm,LoginModel dbLm){
		if(lm.getLoginId().equals(dbLm.getLoginId()) 
				&& lm.getPwd().equals(dbLm.getPwd())){
			return true;
		}
		return false;
	}
}

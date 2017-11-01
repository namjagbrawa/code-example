package com.bingo.code.example.design.templatemethod.rewrite;
/**
 * ������Ա��¼���Ƶ��߼�����
 */
public class WorkerLogin extends LoginTemplate{

	public LoginModel findLoginUser(String loginId) {
		// ����ʡ�Ծ���Ĵ�������ʾ�⣬����һ����Ĭ�����ݵĶ���
		LoginModel lm = new LoginModel();
		lm.setLoginId(loginId);
		lm.setPwd("workerpwd");
		return lm;
	}
	public String encryptPwd(String pwd){
		//���Ǹ���ķ������ṩ�����ļ���ʵ��
		//�����������м��ܣ�����ʹ�ã�MD5��3DES�ȵȣ�ʡ����
		System.out.println("ʹ��MD5�����������");
		return pwd;
	}
}

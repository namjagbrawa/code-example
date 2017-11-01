package com.bingo.code.example.design.templatemethod.rewrite;

/**
 * ��ͨ�û���¼���Ƶ��߼�����
 */
public class NormalLogin extends LoginTemplate{
	public LoginModel findLoginUser(String loginId) {
		// ����ʡ�Ծ���Ĵ�������ʾ�⣬����һ����Ĭ�����ݵĶ���
		LoginModel lm = new LoginModel();
		lm.setLoginId(loginId);
		lm.setPwd("testpwd");
		return lm;
	}
}

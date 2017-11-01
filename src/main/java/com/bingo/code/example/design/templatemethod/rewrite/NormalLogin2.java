package com.bingo.code.example.design.templatemethod.rewrite;

/**
 * ��ͨ�û���¼���Ƽ�ǿ����߼�����
 */
public class NormalLogin2 extends LoginTemplate{
	public LoginModel findLoginUser(String loginId) {
		// ����ʡ�Ծ���Ĵ�������ʾ�⣬����һ����Ĭ�����ݵĶ���
		//ע��һ�㣺����ʹ�õ����Լ���Ҫ������ģ����
		NormalLoginModel nlm = new NormalLoginModel();
		nlm.setLoginId(loginId);
		nlm.setPwd("testpwd");
		nlm.setQuestion("testQuestion");
		nlm.setAnswer("testAnswer");
		
		return nlm;
	}
	public boolean match(LoginModel lm,LoginModel dbLm){
		//���������Ҫ���ǣ���Ϊ���ڽ��е�¼���Ƶ�ʱ��
		//��Ҫ���4��ֵ�Ƿ���ȷ������������ȱʡ��2��
		
		//�ȵ��ø���ʵ�ֺõģ�����ź������Ƿ���ȷ
		boolean f1 = super.match(lm, dbLm);
		if(f1){
			//�����ź�������ȷ�������������ʹ��Ƿ���ȷ
			
			//�Ȱ�����ת�����Լ���Ҫ������
			NormalLoginModel nlm = (NormalLoginModel)lm;
			NormalLoginModel dbNlm = (NormalLoginModel)dbLm;
			//�������ʹ��Ƿ���ȷ
			if(dbNlm.getQuestion().equals(nlm.getQuestion())
					&& dbNlm.getAnswer().equals(nlm.getAnswer())){
				return true;
			}
		}
		return false;
	}
	
}

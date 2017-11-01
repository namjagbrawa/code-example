package com.bingo.code.example.design.templatemethod.rewrite;

public class Client {
	public static void main(String[] args) {
		//׼����¼�˵���Ϣ
		LoginModel lm = new LoginModel();
		lm.setLoginId("admin");
		lm.setPwd("workerpwd");
		//׼�����������жϵĶ���
		LoginTemplate lt = new WorkerLogin();
		LoginTemplate lt2 = new NormalLogin();
		//���е�¼����
		boolean flag = lt.login(lm);
		System.out.println("���Ե�¼����ƽ̨="+flag);
		
		boolean flag2 = lt2.login(lm);
		System.out.println("���Խ�����ͨ��Ա��¼="+flag2);
		
		//׼����¼�˵���Ϣ
		NormalLoginModel nlm = new NormalLoginModel();
		nlm.setLoginId("testUser");
		nlm.setPwd("testpwd");
		nlm.setQuestion("testQuestion");
		nlm.setAnswer("testAnswer");
		//׼�����������жϵĶ���
		LoginTemplate lt3 = new NormalLogin2();
		//���е�¼����
		boolean flag3 = lt3.login(nlm);
		System.out.println("���Խ�����ͨ��Ա��ǿ���¼="+flag3);
	}
}

package com.bingo.code.example.design.command.simple;

public class Client {
	public static void main(String[] args) {
		//׼��Ҫ���������û�о���ʵ������
		Command cmd = new Command(){
			private String str = "";
			public void setStr(String s){
				str = s;
			}
			
			public void execute() {
				System.out.println("��ӡ������Ϊ="+str);
			}
		};
		cmd.setStr("�˻�������ģʽ������Java�ص���ʾ��");
		
		//���ʱ���Invoker����ó�Ϊ������
		Invoker invoker = new Invoker();
		//���°�ť����������ִ������
		invoker.startPrint(cmd);
	}
}
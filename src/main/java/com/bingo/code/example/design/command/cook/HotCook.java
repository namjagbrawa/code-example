package com.bingo.code.example.design.command.cook;

/**
 * ��ʦ�������Ȳ˵ĳ�ʦ
 */
public class HotCook implements CookApi,Runnable{
	/**
	 * ��ʦ����
	 */
	private String name;
	/**
	 * ���췽���������ʦ����
	 * @param name ��ʦ����
	 */
	public HotCook(String name){
		this.name = name;
	}
	
	public void cook(int tableNum,String name) {
		//ÿ�����˵�ʱ���ǲ�һ���ģ��ø��������ģ��һ��
		int cookTime = (int)(20 * Math.random());
		System.out.println(this.name+"��ʦ����Ϊ"+tableNum+"��������"+name);
		try {
			//���߳���Ϣ��ô��ʱ�䣬��ʾ��������
			Thread.sleep(cookTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.name+"��ʦΪ"+tableNum+"���������ˣ�"+name+",���ƺ�ʱ="+cookTime+"��");
	}
	
	public void run() {
		while(true){
			//��������������ȡ�������
			Command cmd = CommandQueue.getOneCommand();
			if(cmd != null){
				//˵��ȡ����������ˣ�����������û�����ý�����
				//��Ϊǰ�涼����֪��������һ����ʦ������ִ���������
				//����֪���ˣ����ǵ�ǰ��ʦʵ�������õ������������
				cmd.setCookApi(this);
				//Ȼ������ִ���������
				cmd.execute();
			} else {
				// this.wait();
			}
			//��Ϣ1��
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
package com.bingo.code.example.design.observer.watcher;
/**
 * ����Ĺ۲���ʵ��
 */
public class Watcher implements WatcherObserver{
	/**
	 * ְ��
	 */
	private String job;
	
	public void update(WaterQualitySubject subject) {
		//������õ������ķ�ʽ
		System.out.println(job+"��ȡ��֪ͨ����ǰ��Ⱦ����Ϊ��"+subject.getPolluteLevel());
	}
	
	public String getJob() {
		return this.job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
}

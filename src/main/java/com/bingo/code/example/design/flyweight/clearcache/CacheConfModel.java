package com.bingo.code.example.design.flyweight.clearcache;
/**
 * ������Ԫ���󻺴�����ö���
 */
public class CacheConfModel{
	/**
	 * ���濪ʼ��ʱ�Ŀ�ʼʱ��
	 */
	private long beginTime;
	/**
	 * ��������ŵĳ���ʱ�䣬��ʵ�������ʹ�õ�ʱ��
	 */
	private double durableTime;
	/**
	 * ���������Ҫ�����ô洢��Ҳ���ǲ���Ҫ�ӻ�����ɾ��
	 */
	private boolean forever;
	public boolean isForever() {
		return forever;
	}
	public void setForever(boolean forever) {
		this.forever = forever;
	}
	public long getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(long beginTime) {
		this.beginTime = beginTime;
	}
	public double getDurableTime() {
		return durableTime;
	}
	public void setDurableTime(double durableTime) {
		this.durableTime = durableTime;
	}
}
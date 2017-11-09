package com.bingo.code.example.design.flyweight.clearcache;

import java.util.*;


/**
 * ��Ԫ������ͨ��ʵ�ֳ�Ϊ����
 * ����ʵ���������պ����ü����Ĺ���
 */
public class FlyweightFactory {
	private static FlyweightFactory factory = new FlyweightFactory();
	private FlyweightFactory(){
		//�����������ֵ���߳�
		Thread t = new ClearCache();
		t.start();
	}
	public static FlyweightFactory getInstance(){
		return factory;
	}
	/**
	 * ������flyweight����
	 */
	private Map<String,Flyweight> fsMap = new HashMap<String,Flyweight>();
	/**
	 * �������汻�������Ļ������ã�keyֵ������map��һ��
	 */
	private  Map<String,CacheConfModel> cacheConfMap = new HashMap<String,CacheConfModel>();
	/**
	 * ������¼����������õĴ�����keyֵ������map��һ��
	 */
	private  Map<String,Integer> countMap = new HashMap<String,Integer>();
	/**
	 * Ĭ�ϱ���6���ӣ���ҪΪ�˲��Է��㣬���ʱ����Ը���Ӧ�õ�Ҫ�����ã�����30����
	 */
	private final  long DURABLE_TIME = 6*1000L; 
	
	/**
	 * ��ȡĳ����Ԫ��ʹ�õĴ���
	 * @param key ��Ԫ��key
	 * @return ��ʹ�õĴ���
	 */
	public synchronized int getUseTimes(String key){
		Integer count = countMap.get(key);
		if(count==null){
			count = 0;
		}
		return count;
	}
	
	/**
	 * ��ȡkey��Ӧ����Ԫ����
	 * @param key ��ȡ��Ԫ�����key
	 * @return key��Ӧ����Ԫ����
	 */
	public synchronized Flyweight getFlyweight(String key) {
		Flyweight f = fsMap.get(key);
		//��һ�����򵥵��д��
		if(f==null){
			f = new AuthorizationFlyweight(key);
			fsMap.put(key,f);
			//ͬʱ�������ü���
			countMap.put(key, 1);
			//ͬʱ���û�����������
			CacheConfModel cm = new CacheConfModel();
			cm.setBeginTime(System.currentTimeMillis());
			cm.setForever(false);
			cm.setDurableTime(DURABLE_TIME);
			
			cacheConfMap.put(key, cm);
		}else{
			//��ʾ����ʹ�ã���ôӦ���������û�������
			CacheConfModel cm = cacheConfMap.get(key);
			cm.setBeginTime(System.currentTimeMillis());
			//���û�ȥ
			this.cacheConfMap.put(key, cm);
			//ͬʱ������1
			Integer count = countMap.get(key);
			count++;
			countMap.put(key, count);
		}
		return f;
	}
	/**
	 * ɾ��key��Ӧ����Ԫ�������������Ӧ�Ļ������ú����ô����ļ�¼��������
	 * @param key Ҫɾ������Ԫ�����key
	 */
	private synchronized void removeFlyweight(String key){
		this.fsMap.remove(key);
		this.cacheConfMap.remove(key);
		this.countMap.remove(key);
	}
	/**
	 * ά�����������̣߳��ڲ�ʹ��
	 */
	private  class ClearCache extends Thread{
		public void run(){
			while(true){
				Set<String> tempSet = new HashSet<String>();
				Set<String> set = cacheConfMap.keySet();
				for(String key : set){
					CacheConfModel ccm = cacheConfMap.get(key);
					//�Ƚ��Ƿ���Ҫ���
					if((System.currentTimeMillis()-ccm.getBeginTime())>= ccm.getDurableTime()){
						//����������ȼ�¼����
						tempSet.add(key);
					}
				}
				//�������
				for(String key : tempSet){
					FlyweightFactory.getInstance().removeFlyweight(key);					
				}
				System.out.println("now thread="+fsMap.size()+",fsMap=="+fsMap.keySet());
				//��Ϣ1���������ж�
				try {
					Thread.sleep(1000L);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

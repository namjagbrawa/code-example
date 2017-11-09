package com.bingo.code.example.design.flyweight.module;

import java.util.*;
/**
 * ��Ԫ����
 */
public class FlyweightFactory {
	/**
	 * ������flyweight��������ֻ��ʾ��һ��
	 */
	private Map<String,Flyweight> fsMap = new HashMap<String,Flyweight>();
	/**
	 * ��ȡkey��Ӧ����Ԫ����
	 * @param key ��ȡ��Ԫ�����key��ֻ��ʾ��
	 * @return key��Ӧ����Ԫ����
	 */
	public Flyweight getFlyweight(String key) {
		//����������������ʵ�ֲ������£�		
		//1���ȴӻ���������ң��Ƿ����key��Ӧ��Flyweight����
		Flyweight f = fsMap.get(key);
		//2��������ڣ��ͷ������Ӧ��Flyweight����
		if(f==null){
			//3�����������
			//3.1������һ���µ�Flyweight����
			f = new ConcreteFlyweight(key);
			//3.2��������µ�Flyweight������ӵ���������
			fsMap.put(key,f);
			//3.3��Ȼ�󷵻�����µ�Flyweight����
		}
		return f;
	}
}
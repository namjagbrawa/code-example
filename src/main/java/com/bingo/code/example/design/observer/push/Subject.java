package com.bingo.code.example.design.observer.push;

import java.util.ArrayList;
import java.util.List;

/**
 * Ŀ�������Ϊ���۲��ߣ�ʹ����ģ��
 */
public class Subject {
	/**
	 * ��������ע��Ĺ۲��߶���Ҳ���Ǳ�ֽ�Ķ�����
	 */
	private List<Observer> readers = new ArrayList<Observer>();
	/**
	 * ��ֽ�Ķ�����Ҫ�����綩�ģ���Ҫע��
	 * @param reader ��ֽ�Ķ��� 
	 * @return �Ƿ�ע��ɹ�
	 */
	public void attach(Observer reader) {
		readers.add(reader);
	}
	/**
	 * ��ֽ�Ķ��߿���ȡ������
	 * @param reader ��ֽ�Ķ���
	 * @return �Ƿ�ȡ���ɹ�
	 */
	public void detach(Observer reader) {
		readers.remove(reader);
	}
	/**
	 * ��ÿ�ڱ�ֽӡˢ�����󣬾�ҪѸ�ٵ������ı��͵����ߵ����У�
	 * �൱��֪ͨ���ߣ�������֪��
	 * @param content Ҫ�������͵�����
	 */
	protected void notifyObservers(String content) {
		for(Observer reader : readers){
			reader.update(content);
		}
	}
}

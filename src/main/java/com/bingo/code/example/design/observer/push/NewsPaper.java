package com.bingo.code.example.design.observer.push;

/**
 * ��ֽ���󣬾����Ŀ��ʵ��
 */
public class NewsPaper extends Subject{
	/**
	 * ��ֽ�ľ�������
	 */
	private String content;
	/**
	 * ��ȡ��ֽ�ľ�������
	 * @return ��ֽ�ľ�������
	 */
	public String getContent() {
		return content;
	}
	/**
	 * ʾ�⣬���ñ�ֽ�ľ������ݣ��൱��Ҫ���汨ֽ��
	 * @param content ��ֽ�ľ�������
	 */
	public void setContent(String content) {
		this.content = content;
		//�������ˣ�˵���ֳ���ֽ�ˣ��Ǿ�֪ͨ���еĶ���
		notifyObservers(content);
	}
}

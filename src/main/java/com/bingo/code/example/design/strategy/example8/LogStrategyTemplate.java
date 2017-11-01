package com.bingo.code.example.design.strategy.example8;
import java.text.*;
/**
 * ʵ����־���Եĳ���ģ�壬ʵ�ָ���Ϣ���ʱ��
 */
public abstract class LogStrategyTemplate implements LogStrategy{
	
	public final void log(String msg) {
		//��һ��������Ϣ��Ӽ�¼��־��ʱ��
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		msg = df.format(new java.util.Date())+" �����ǣ�"+ msg;
		//�ڶ���������ִ����־��¼
		doLog(msg);
	}
	/**
	 * ����ִ����־��¼��������ȥ����ʵ��
	 * @param msg ���¼����־��Ϣ
	 */
	protected abstract void doLog(String msg);
}
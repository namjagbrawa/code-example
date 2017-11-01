package com.bingo.code.example.design.templatemethod.template;
/**
 * һ����Ϊ������ģ�涨��ʾ��
 */
public abstract class AbstractTemplate {
	/**
	 * ģ�巽���������㷨�Ǽ�
	 */
	public final void templateMethod(){
		//��һ��
		this.operation1();
		//�ڶ���		
		this.operation2();
		//������
		this.doPrimitiveOperation1();
		//���Ĳ�
		this.doPrimitiveOperation2();
		//���岽
		this.hookOperation1();
	}
	/**
	 * �������1���㷨�еĲ��裬�̶�ʵ�֣��������಻��Ҫ����
	 */
	private void operation1(){
		//����������ʵ��
	}
	/**
	 * �������2���㷨�еĲ��裬�̶�ʵ�֣����������Ҫ���ʣ�
	 * ��ȻҲ���Զ����public�ģ������Ա����ǣ������final��
	 */
	protected final void operation2(){
		//����������ʵ��
	}
	/**
	 * �����AbstractClass����������Ĺ������ܣ�
	 * ��ͨ�����Ǿ�����㷨����
	 */
	protected void commonOperation(){
		//����������ʵ��
	}
	/**
	 * ԭ�����1���㷨�еı�Ҫ���裬�����޷�ȷ���������ʵ�֣���Ҫ������ʵ��
	 */
	protected abstract void doPrimitiveOperation1();
	/**
	 * ԭ�����2���㷨�еı�Ҫ���裬�����޷�ȷ���������ʵ�֣���Ҫ������ʵ��
	 */
	protected abstract void doPrimitiveOperation2();
	/**
	 * ���Ӳ������㷨�еĲ��裬��һ����Ҫ���ṩȱʡʵ��
	 * ������ѡ�񲢾���ʵ��
	 */
	protected void hookOperation1(){
		//�������ṩȱʡ��ʵ��
	}
	/**
	 * ��������������ĳ������������Object�����ˣ����㷨ʵ���п�����Ҫ
	 * @return ������ĳ���㷨ʵ����Ҫ�Ķ���
	 */
	protected abstract Object createOneObject();
}

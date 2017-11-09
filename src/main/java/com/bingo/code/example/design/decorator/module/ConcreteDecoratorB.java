package com.bingo.code.example.design.decorator.module;

/**
 * װ�����ľ���ʵ�ֶ���������������ְ��
 */
public class ConcreteDecoratorB extends Decorator {
	public ConcreteDecoratorB(Component component) {
		super(component);
	}
	/**
	 * ��Ҫ��ӵ�ְ��
	 */
	private void addedBehavior() {
		//��Ҫ��ӵ�ְ��ʵ��
	}
	public void operation() {
		//���ø���ķ����������ڵ���ǰ��ִ��һЩ���Ӷ���
		super.operation();
		addedBehavior();
	}
}


package com.bingo.code.example.design.composite.module;

import java.util.*;

/**
 * ��϶���ͨ����Ҫ�洢�Ӷ��󣬶������Ӳ����Ĳ�����Ϊ��
 * ��ʵ����Component���涨������Ӳ����йصĲ���
 */
public class Composite extends Component {
	/**
	 * �����洢��϶����а��������������
	 */
	private List<Component> childComponents = null;

	/**
	 * ʾ�ⷽ����ͨ����������Ҫʵ�ֵݹ�ĵ���
	 */
	public void someOperation() {		
		if (childComponents != null){
			for(Component c : childComponents){
				//�ݹ�Ľ����������Ӧ�����ĵ���
				c.someOperation();
			}
		}
	}
	public void addChild(Component child) {
		//�ӳٳ�ʼ��
		if (childComponents == null) {
			childComponents = new ArrayList<Component>();
		}
		childComponents.add(child);
	}

	public void removeChild(Component child) {
		if (childComponents != null) {
			childComponents.remove(child);
		}
	}

	public Component getChildren(int index) {
		if (childComponents != null){
			if(index>=0 && index<childComponents.size()){
				return childComponents.get(index);
			}
		}
		return null;
	}
}


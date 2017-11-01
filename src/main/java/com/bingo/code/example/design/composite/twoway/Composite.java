package com.bingo.code.example.design.composite.twoway;

import java.util.ArrayList;
import java.util.List;

/**
 * ��϶��󣬿��԰���������϶������Ҷ�Ӷ���
 */
public class Composite extends Component{

	public void addChild(Component child) {
		//�ӳٳ�ʼ��
		if (childComponents == null) {
			childComponents = new ArrayList<Component>();
		}
		childComponents.add(child);
		
		//��ӶԸ����������
		child.setParent(this);
	}

	public void removeChild(Component child) {
		if (childComponents != null) {
			//���ҵ�Ҫɾ��������ڼ����е�����λ��
			int idx = childComponents.indexOf(child);
			if (idx != -1) {
				//�Ȱѱ�ɾ������Ʒ������ĸ���Ʒ������ó�Ϊ��ɾ������Ʒ���������ĸ���Ʒ���
				for(Component c : child.getChildren()){
					//ɾ������������Ǳ�ʵ����һ�����������
					c.setParent(this);
					//�ѱ�ɾ������Ʒ������������������ӵ���ǰʵ����
					childComponents.add(c);
				}
				
				//���ɾ��
				childComponents.remove(idx);
			}
		}		
	}

	public List<Component> getChildren() {
		return childComponents;
	}
	/*-------------------������ԭ�е�ʵ�֣�û�б仯----------------------*/		
	/**
	 * �����洢��϶����а��������������
	 */
	private List<Component> childComponents = null;
	/**
	 * ��϶��������
	 */
	private String name = "";
	/**
	 * ���췽����������϶��������
	 * @param name ��϶��������
	 */
	public Composite(String name){
		this.name = name;
	}
	/**
	 * �����϶�������Ľṹ
	 * @param preStr ǰ׺����Ҫ�ǰ��ղ㼶ƴ�ӵĿո�ʵ���������
	 */
	public void printStruct(String preStr){
		//�Ȱ��Լ����ȥ
		System.out.println(preStr+"+"+this.name);
		//��������������������ô�������Щ���������
		if(this.childComponents!=null){
			//Ȼ�����һ���ո񣬱�ʾ�������һ���ո�
			preStr+=" ";		
			//�����ǰ������Ӷ�����
			for(Component c : childComponents){
				//�ݹ����ÿ���Ӷ���
				c.printStruct(preStr);
			}
		}
	}
}

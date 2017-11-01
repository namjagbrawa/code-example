package com.bingo.code.example.design.composite.secure;
import java.util.*;

/**
 * ��϶��󣬿��԰���������϶������Ҷ�Ӷ���
 */
public class Composite extends Component{
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
	
	public void addChild(Component child) {
		//�ӳٳ�ʼ��
		if (childComponents == null) {
			childComponents = new ArrayList<Component>();
		}
		childComponents.add(child);
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

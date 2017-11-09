package com.bingo.code.example.design.visitor.invisitor;
import java.util.*;
/**
 * ��϶��󣬿��԰���������϶������Ҷ�Ӷ���
 * �൱�ڷ�����ģʽ�ľ���Elementʵ�ֶ���
 */
public class Composite extends Component{
	public void accept(Visitor visitor) {
		//�ص������߶������Ӧ����
		visitor.visitComposite(this);
	}
	/**
	 * �����洢��϶����а��������������
	 */
	private List<Component> childComponents = new ArrayList<Component>();
	public List<Component> getChildComponents() {
		return childComponents;
	}
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
	public String getName() {
		return name;
	}
}

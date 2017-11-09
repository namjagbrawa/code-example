package com.bingo.code.example.design.visitor.invisitor;
/**
 * Ҷ�Ӷ����൱�ڷ�����ģʽ�ľ���Elementʵ�ֶ���
 */
public class Leaf extends Component{
	public void accept(Visitor visitor) {
		//�ص������߶������Ӧ����
		visitor.visitLeaf(this);
	}
	/**
	 * Ҷ�Ӷ��������
	 */
	private String name = "";
	/**
	 * ���췽��������Ҷ�Ӷ��������
	 * @param name Ҷ�Ӷ��������
	 */
	public Leaf(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

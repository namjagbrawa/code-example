package com.bingo.code.example.design.composite.nodesign;
import java.util.*;

/**
 * ��϶��󣬿��԰���������϶������Ҷ�Ӷ���
 */
public class Composite {
	/**
	 * ������¼������������϶���
	 */
	private Collection<Composite> childComposite = new ArrayList<Composite>();
	/**
	 * ������¼����������Ҷ�Ӷ���
	 */
	private Collection<Leaf> childLeaf = new ArrayList<Leaf>();
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
	 * ����϶�����뱻��������������϶���
	 * @param c ����������������϶���
	 */
	public void addComposite(Composite c){
		this.childComposite.add(c);
	}
	/**
	 * ����϶�����뱻��������Ҷ�Ӷ���
	 * @param leaf ����������Ҷ�Ӷ���
	 */
	public void addLeaf(Leaf leaf){
		this.childLeaf.add(leaf);
	}
	/**
	 * �����϶�������Ľṹ
	 * @param preStr ǰ׺����Ҫ�ǰ��ղ㼶ƴ�ӵĿո�ʵ���������
	 */
	public void printStruct(String preStr){
		//�Ȱ��Լ����ȥ
		System.out.println(preStr+"+"+this.name);
		//Ȼ�����һ���ո񣬱�ʾ�������һ���ո�����Լ�������Ҷ�Ӷ���
		preStr+=" ";
		for(Leaf leaf : childLeaf){
			leaf.printStruct(preStr);
		}
		//�����ǰ������Ӷ�����
		for(Composite c : childComposite){
			//�ݹ����ÿ���Ӷ���
			c.printStruct(preStr);
		}
	}
}

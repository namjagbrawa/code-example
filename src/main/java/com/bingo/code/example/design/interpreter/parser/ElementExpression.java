package com.bingo.code.example.design.interpreter.parser;
import java.util.*;

import org.w3c.dom.Element;

/**
 * ����Ԫ����Ϊ���ս���Ľ�����
 */
public class ElementExpression extends ReadXmlExpression{
	/**
	 * ������¼��ϵ�ReadXmlExpressionԪ��
	 */
	private Collection<ReadXmlExpression> eles = new ArrayList<ReadXmlExpression>();
	/**
	 * Ԫ�ص�����
	 */
	private String eleName = "";
	public ElementExpression(String eleName){
		this.eleName = eleName;
	}
	public boolean addEle(ReadXmlExpression ele){
		this.eles.add(ele);
		return true;
	}
	public boolean removeEle(ReadXmlExpression ele){
		this.eles.remove(ele);
		return true;
	}
	
	public String[] interpret(Context c) {
		//��ȡ����������ĸ���Ԫ��
		List<Element> pEles = c.getPreEles();
		Element ele = null;
		//�ѵ�ǰ��ȡ��Ԫ�طŵ�����������
		List<Element> nowEles = new ArrayList<Element>();		
		if(pEles.size()==0){
			//˵�����ڻ�ȡ���Ǹ�Ԫ��
			ele = c.getDocument().getDocumentElement();
			pEles.add(ele);
			c.setPreEles(pEles);
		}else{
			for(Element tempEle : pEles){
				nowEles.addAll(c.getNowEles(tempEle, eleName));
				if(nowEles.size()>0){
					//�ҵ�һ����ֹͣ
					break;
				}
			}
			List<Element> tempList = new ArrayList<Element>();
			tempList.add(nowEles.get(0));
			c.setPreEles(tempList);
		}
		
		//ѭ��������Ԫ�ص�interpret����
		String [] ss = null;
		for(ReadXmlExpression tempEle : eles){
			ss = tempEle.interpret(c);
		}
		return ss;
	}
}
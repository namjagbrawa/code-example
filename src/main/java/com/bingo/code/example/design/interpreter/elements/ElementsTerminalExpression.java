package com.bingo.code.example.design.interpreter.elements;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;
/**
 * �Զ��Ԫ����Ϊ�ս���Ľ��ʹ������
 */
public class ElementsTerminalExpression  extends ReadXmlExpression{
	/**
	 * Ԫ�ص�����
	 */
	private String eleName = "";
	public ElementsTerminalExpression(String name){
		this.eleName = name;
	}
	
	public String[] interpret(Context c) {
		//��ȡ����������ĸ���Ԫ��
		List<Element> pEles = c.getPreEles();
		//��ȡ��ǰ�Ķ��Ԫ��
		List<Element> nowEles = new ArrayList<Element>();
		
		for(Element ele : pEles){
			nowEles.addAll(c.getNowEles(ele, eleName));
		}

		//Ȼ����Ҫȥ��ȡ��ЩԪ�ص�ֵ
		String[] ss = new String[nowEles.size()];
		for(int i=0;i<ss.length;i++){
			ss[i] = nowEles.get(i).getFirstChild().getNodeValue();
		}
		return ss;
	}

}

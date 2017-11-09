package com.bingo.code.example.design.interpreter.parser;

import java.util.List;

import org.w3c.dom.Element;
/**
 * Ԫ����Ϊ�ս����Ӧ�Ľ�����
 */
public class ElementTerminalExpression  extends ReadXmlExpression{
	/**
	 * Ԫ�ص�����
	 */
	private String eleName = "";
	public ElementTerminalExpression(String name){
		this.eleName = name;
	}
	
	public String[] interpret(Context c) {
		//��ȡ����������ĵ�ǰԪ����Ϊ����Ԫ��
		List<Element> pEles = c.getPreEles();
		//���ҵ���ǰԪ����������Ӧ��xmlԪ��
		Element ele = null;
		if(pEles.size() == 0){
			//˵�����ڻ�ȡ���Ǹ�Ԫ��
			ele = c.getDocument().getDocumentElement();
		}else{
			//��ȡ��ǰ��Ԫ��
			ele = c.getNowEles(pEles.get(0), eleName).get(0);
		}

		//Ȼ����Ҫȥ��ȡ���Ԫ�ص�ֵ
		String[] ss = new String[1];
		ss[0] = ele.getFirstChild().getNodeValue();
		return ss;
	}
}

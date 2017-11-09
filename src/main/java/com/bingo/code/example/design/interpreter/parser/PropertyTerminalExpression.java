package com.bingo.code.example.design.interpreter.parser;
/**
 * ������Ϊ�ս����Ӧ�Ľ�����
 */
public class PropertyTerminalExpression extends ReadXmlExpression{
	/**
	 * ���Ե�����
	 */
	private String propName;
	public PropertyTerminalExpression(String propName){
		this.propName = propName;
	}
	
	public String[] interpret(Context c) {
		//ֱ�ӻ�ȡ����Ԫ�ص����Ե�ֵ
		String[] ss = new String[1];
		ss[0] = c.getPreEles().get(0).getAttribute(this.propName);
		return ss;
	}
}

package com.bingo.code.example.design.interpreter.parser;
/**
 * ������װÿһ������������Ԫ�ض�Ӧ������
 */
public class ParserModel {
	/**
	 * �Ƿ񵥸�ֵ
	 */
	private boolean singleVlaue;
	/**
	 * �Ƿ����ԣ��������Ծ���Ԫ��
	 */
	private boolean propertyValue;
	/**
	 * �Ƿ��ս��
	 */
	private boolean end;
	public boolean isEnd() {
		return end;
	}
	public void setEnd(boolean end) {
		this.end = end;
	}
	public boolean isSingleVlaue() {
		return singleVlaue;
	}
	public void setSingleVlaue(boolean oneVlaue) {
		this.singleVlaue = oneVlaue;
	}
	public boolean isPropertyValue() {
		return propertyValue;
	}
	public void setPropertyValue(boolean propertyValue) {
		this.propertyValue = propertyValue;
	}
}

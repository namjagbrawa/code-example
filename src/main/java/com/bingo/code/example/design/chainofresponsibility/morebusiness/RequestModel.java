package com.bingo.code.example.design.chainofresponsibility.morebusiness;
/**
 * ͨ�õ��������
 */
public class RequestModel {
	/**
	 * ��ʾ�����ҵ������
	 */
	private String type;
	/**
	 * ͨ�����췽���Ѿ����ҵ�����ʹ��ݽ���
	 * @param type �����ҵ������
	 */
	public RequestModel(String type){
		this.type = type;
	}
	public String getType() {
		return type;
	}	
}
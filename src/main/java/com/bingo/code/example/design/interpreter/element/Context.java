package com.bingo.code.example.design.interpreter.element;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
/**
 *	�����ģ�����������������Ҫ��һЩȫ����Ϣ
 */
public class Context {
	/**
	 * ��һ���������Ԫ��
	 */
	private Element preEle = null;
	/**
	 * Dom����Xml��Document����
	 */
	private Document document = null;
	/**
	 * ���췽��
	 * @param filePathName ��Ҫ��ȡ��xml��·��������
	 * @throws Exception
	 */
	public Context(String filePathName) throws Exception{
		//ͨ��������Xml����������ȡ��������xml��Ӧ��Document����
		this.document = XmlUtil.getRoot(filePathName);
	}
	/**
	 * ���³�ʼ��������
	 */
	public void reInit(){
		preEle = null;
	}
	/**
	 * ����Expression����ʹ�õķ���,
	 * ���ݸ�Ԫ�غ͵�ǰԪ�ص���������ȡ��ǰ��Ԫ��
	 * @param pEle ��Ԫ��
	 * @param eleName ��ǰԪ�ص�����
	 * @return �ҵ��ĵ�ǰԪ��
	 */
	public Element getNowEle(Element pEle,String eleName){
		NodeList tempNodeList = pEle.getChildNodes();
		for(int i=0;i<tempNodeList.getLength();i++){
			if(tempNodeList.item(i) instanceof Element){
				Element nowEle = (Element)tempNodeList.item(i);
				if(nowEle.getTagName().equals(eleName)){
					return nowEle;
				}
			}
		}
		return null;
	}
	
	public Element getPreEle() {
		return preEle;
	}
	public void setPreEle(Element preEle) {
		this.preEle = preEle;
	}
	
	public Document getDocument() {
		return document;
	}
}

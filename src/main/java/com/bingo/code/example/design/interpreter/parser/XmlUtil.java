package com.bingo.code.example.design.interpreter.parser;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class XmlUtil {
	public static Document getRoot(String filePathName) throws Exception{
		Document doc = null;
	      //����һ������������
	      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	      //���һ��DocumentBuilder���������������˾����DOM������
	      DocumentBuilder builder=factory.newDocumentBuilder();
	      //�õ�һ����ʾXML�ĵ���Document����
	      doc=builder.parse(filePathName);
	      //ȥ��XML�ĵ�����Ϊ��ʽ�����ݵĿհ׶�ӳ����DOM���еĲ���Ҫ��Text Node����
	      doc.normalize();
	      return doc;
	}
}

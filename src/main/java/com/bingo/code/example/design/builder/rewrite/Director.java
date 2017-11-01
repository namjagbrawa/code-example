package com.bingo.code.example.design.builder.rewrite;

import java.util.Collection;
import java.util.Map;

/**
 * ָ���ߣ�ָ��ʹ�ù������Ľӿ�������������ļ��Ķ���
 */
public class Director {
	/**
	 * ���е�ǰ��Ҫʹ�õĹ���������
	 */
	private Builder builder;
	/**
	 * ���췽�������빹��������
	 * @param builder ����������
	 */
	public Director(Builder builder) {
		this.builder = builder;
	}
	/**
	 * ָ���������������յ�������ļ��Ķ���
	 * @param ehm �ļ�ͷ������
	 * @param mapData ���ݵ�����
	 * @param efm �ļ�β������
	 */
	public void construct(ExportHeaderModel ehm,Map<String,Collection<ExportDataModel>> mapData,ExportFooterModel efm) {
		//1���ȹ���Header
		builder.buildHeader(ehm);
		//2��Ȼ�󹹽�Body
		builder.buildBody(mapData);
		//3��Ȼ�󹹽�Footer
		builder.buildFooter(efm);
	}
}
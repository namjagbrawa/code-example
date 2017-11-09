package com.bingo.code.example.design.decorator.nodesign;
import java.util.*;
/**
 * ���ڴ���ģ�����ݿ⣬׼����������ݣ��ü��㽱��
 */
public class TempDB {
	private TempDB(){}
	/**
	 * ��¼ÿ���˵��¶����۶ֻ������Ա���·�û����
	 */
	public static Map<String,Double> mapMonthSaleMoney = new HashMap<String,Double>();
	
	static{
		//����������
		mapMonthSaleMoney.put("����",10000.0);
		mapMonthSaleMoney.put("����",20000.0);
		mapMonthSaleMoney.put("����",30000.0);
	}
}

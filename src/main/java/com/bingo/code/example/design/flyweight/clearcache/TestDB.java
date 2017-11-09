package com.bingo.code.example.design.flyweight.clearcache;
import java.util.*;
/**
 * �������ã����ڴ���ģ�����ݿ��е�ֵ
 */
public class TestDB {
	/**
	 * ������ŵ�����Ȩ���ݵ�ֵ
	 */
	public static Collection<String> colDB = new ArrayList<String>();
	/**
	 * ������������Ȩ���ݵ�ֵ��keyΪ������ݵ�id��valueΪ����ϰ����Ķ�����Ȩ���ݵ�ֵ
	 */
	public static Map<String,String[]> mapDB = new HashMap<String,String[]>();
	
	static{
		//ͨ����̬�������ģ������ݣ�����һ����ʶ�������Ƿ������Ȩ����
		colDB.add("����,��Ա�б�,�鿴,1");
		colDB.add("����,��Ա�б�,�鿴,1");
		colDB.add("����,����н������,,2");
		
		mapDB.put("����н������",new String[]{"н������,�鿴","н������,�޸�"});
		
		//���Ӹ������Ȩ����
		for(int i=0;i<3;i++){
			colDB.add("����"+i+",��Ա�б�,�鿴,1");
		}
	}	
}

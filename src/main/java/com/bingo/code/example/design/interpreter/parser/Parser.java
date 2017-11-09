package com.bingo.code.example.design.interpreter.parser;

import java.util.*;
/**
 * �����﷨���������ʽ��ת����Ϊ��Ӧ�ĳ����﷨��
 */
public class Parser {
	/**
	 * ˽�л��������������ⲿ��ν�Ĵ�������ʵ��
	 */
	private Parser(){
		//
	}
	//���弸���������ڲ�ʹ��
	private final static String BACKLASH = "/";
	private final static String DOT = ".";
	private final static String DOLLAR = "$";
	/**
	 * ���շֽ���Ⱥ��¼��Ҫ������Ԫ�ص�����
	 */
	private static List<String> listEle = null;
	/**
	 * ����һ���ַ������ʽ��ͨ����������ϳ�Ϊһ��������﷨��
	 * @param expr ����Ҫȡֵ���ַ������ʽ
	 * @return ��Ӧ�ĳ����﷨��
	 */
	public static ReadXmlExpression parse(String expr){
		//�ȳ�ʼ����¼�������Ԫ�ص����Ƶļ���
		listEle = new ArrayList<String>();
		
		//��һ�����ֽ���ʽ���õ���Ҫ������Ԫ�����ƺ͸�Ԫ�ض�Ӧ�Ľ���ģ��
		Map<String,ParserModel> mapPath = parseMapPath(expr);
		
		//�ڶ��������ݽڵ������ת����Ϊ��Ӧ�Ľ���������
		List<ReadXmlExpression> list = mapPath2Interpreter(mapPath);

		//����������ϳ����﷨����һ��Ҫ�����Ⱥ�˳������ϣ�
		//�������İ�����ϵ������
		ReadXmlExpression returnRe = buildTree(list);
	
		return returnRe;			
	}

	
/*----------------------��ʼʵ�ֵ�һ��-----------------------*/			
	/**
	 * ���մ�����˳�����ֽ���ʽ���õ���Ҫ������Ԫ�����ƣ�
	 * ���и�Ԫ�ض�Ӧ�Ľ���ģ��
	 * @param expr ��Ҫ�ֽ�ı��ʽ
	 * @return �õ���Ҫ������Ԫ�����ƣ����и�Ԫ�ض�Ӧ�Ľ���ģ��
	 */
	private static Map<String,ParserModel> parseMapPath(String expr){
		//�Ȱ���/�ָ��ַ���
		StringTokenizer tokenizer = new StringTokenizer(expr, BACKLASH);
		//��ʼ��һ��map������ŷֽ������ֵ
		Map<String,ParserModel> mapPath = new HashMap<String,ParserModel>();
		while (tokenizer.hasMoreTokens()) {
			String onePath = tokenizer.nextToken();
			if (tokenizer.hasMoreTokens()) {
				//������һ��ֵ��˵���ⲻ�����һ��Ԫ��
				//�������ڵ��﷨�����Ա�Ȼ��������Ҳ��������
				setParsePath(false,onePath,false,mapPath);
			} else {
				//˵���������
				int dotIndex = onePath.indexOf(DOT);
				if (dotIndex > 0) {
					//˵����Ҫ��ȡ���Ե�ֵ���ǾͰ���"."���ָǰ��ľ���Ԫ�����֣�����������Ե�����
					String eleName = onePath.substring(0, dotIndex);
					String propName = onePath.substring(dotIndex + 1);
					//��������ǰ����Ǹ�Ԫ�أ���Ȼ�������һ����Ҳ��������
					setParsePath(false,eleName,false,mapPath);
					//�������ԣ��������ڵ��﷨���壬����ֻ�������һ��
					setParsePath(true,propName,true,mapPath);
				} else {
					//˵����ȡԪ�ص�ֵ�����������һ��Ԫ�ص�ֵ
					setParsePath(true,onePath,false,mapPath);
				}
				break;
			}
		}
		return mapPath;
	}
	/**
	 * ���շֽ������λ�ú�������������Ҫ������Ԫ�����ƣ�
	 * ���и�Ԫ�ض�Ӧ�Ľ���ģ��
	 * @param end �Ƿ������һ��
	 * @param ele Ԫ������
	 * @param propertyValue �Ƿ���ȡ����
	 * @param mapPath ������Ҫ������Ԫ�����ƣ����и�Ԫ�ض�Ӧ�Ľ���ģ�͵�Map����
	 */
	private static void setParsePath(boolean end,String ele,boolean propertyValue,Map<String,ParserModel> mapPath){
		ParserModel pm = new ParserModel();
		pm.setEnd(end);
		//�������$���ž�˵������һ��ֵ
		pm.setSingleVlaue(!(ele.indexOf(DOLLAR)>0));
		pm.setPropertyValue(propertyValue);				
		//ȥ��$
		ele = ele.replace(DOLLAR, "");
		mapPath.put(ele,pm);
		listEle.add(ele);
	}
/*----------------------��һ��ʵ�ֽ���-----------------------*/

/*----------------------��ʼʵ�ֵڶ���-----------------------*/	
	/**
	 * �ѷֽ������Ԫ�����ƣ����ݶ�Ӧ�Ľ���ģ��ת����Ϊ��Ӧ�Ľ���������
	 * @param mapPath �ֽ��������Ҫ������Ԫ�����ƣ����и�Ԫ�ض�Ӧ�Ľ���ģ��
	 * @return ��ÿ��Ԫ��ת����Ϊ��Ӧ�Ľ����������ļ���
	 */
	private static List<ReadXmlExpression> mapPath2Interpreter(Map<String,ParserModel> mapPath){
		List<ReadXmlExpression> list = new ArrayList<ReadXmlExpression>();
		//һ��Ҫ���շֽ���Ⱥ�˳����ת���ɽ���������
		for(String key : listEle){
			ParserModel pm = mapPath.get(key);
			ReadXmlExpression obj = null;
			if(!pm.isEnd()){
				if(pm.isSingleVlaue()){
					//�������һ������һ��ֵ��ת��Ϊ
					obj = new ElementExpression(key);					
				}else{
					//�������һ�����Ƕ��ֵ��ת��Ϊ
					obj = new ElementsExpression(key);
				}
			}else{
				if(pm.isPropertyValue()){
					if(pm.isSingleVlaue()){
						//�����һ������һ��ֵ��ȡ���Ե�ֵ��ת��Ϊ
						obj = new PropertyTerminalExpression(key);
					}else{
						//�����һ�����Ƕ��ֵ��ȡ���Ե�ֵ��ת��Ϊ
						obj = new PropertysTerminalExpression(key);
					}
				}else{
					if(pm.isSingleVlaue()){
						//�����һ������һ��ֵ��ȡԪ�ص�ֵ��ת��Ϊ
						obj = new ElementTerminalExpression(key);
					}else{
						//�����һ�����Ƕ��ֵ��ȡԪ�ص�ֵ��ת��Ϊ
						obj = new ElementsTerminalExpression(key);
					}
				}
			}
			//��ת����Ķ�����ӵ�������
			list.add(obj);
		}
		return list;
	}
/*----------------------�ڶ���ʵ�ֽ���-----------------------*/	
	
/*----------------------��ʼʵ�ֵ�����-----------------------*/		
	private static ReadXmlExpression buildTree(List<ReadXmlExpression> list){
		//��һ������Ҳ�Ƿ���ȥ�Ķ��󣬾��ǳ����﷨���ĸ�
		ReadXmlExpression returnRe = null;
		//������һ������
		ReadXmlExpression preRe = null;
		for(ReadXmlExpression re : list){			
			if(preRe==null){
				//˵���ǵ�һ��Ԫ��
				preRe = re;
				returnRe = re;
			}else{
				//��Ԫ����ӵ���һ���������棬ͬʱ�ѱ��������ó�ΪoldRe����Ϊ��һ������ĸ����
				if(preRe instanceof ElementExpression){
					ElementExpression ele = (ElementExpression)preRe;
					ele.addEle(re);
					preRe = re;
				}else if(preRe instanceof ElementsExpression){
					ElementsExpression eles = (ElementsExpression)preRe;
					eles.addEle(re);
					preRe = re;
				}
			}
		}
		return returnRe;
	}
/*----------------------������ʵ�ֽ���-----------------------*/		
}

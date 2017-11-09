package com.bingo.code.example.design.decorator.salebusiness;
import java.text.*;
import java.util.Date;
/**
 * ʵ����־��¼
 */
public class LogDecorator extends Decorator{
	public LogDecorator(GoodsSaleEbi ebi){
		super(ebi);
	}
	
	public boolean sale(String user,String customer, SaleModel saleModel) {
		//ִ��ҵ����
		boolean f = this.ebi.sale(user, customer, saleModel);
		//��ִ��ҵ���ܹ��󣬼�¼��־
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		System.out.println("��־��¼��"+user+"��"+df.format(new Date())+"ʱ������һ�����ۼ�¼���ͻ���"+customer+",�����¼��"+saleModel);
		return f;
	}

}

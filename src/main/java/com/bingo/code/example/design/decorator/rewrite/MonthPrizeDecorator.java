package com.bingo.code.example.design.decorator.rewrite;

import java.util.Date;
/**
 * װ�������󣬼��㵱��ҵ�񽱽�
 */
public class MonthPrizeDecorator extends Decorator{
	public MonthPrizeDecorator(Component c){
		super(c);
	}
	
	public double calcPrize(String user, Date begin, Date end) {
		//1���Ȼ�ȡǰ����������Ľ���
		double money = super.calcPrize(user, begin, end);
		//2��Ȼ����㵱��ҵ�񽱽�,������Ա��ʱ��ȥ��ȡ���µ�ҵ��Ȼ���ٳ���3%
		double prize = TempDB.mapMonthSaleMoney.get(user) * 0.03;
		System.out.println(user+"����ҵ�񽱽�"+prize);
		return money + prize;
	}

}

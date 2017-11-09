package com.bingo.code.example.design.decorator.nodesign;

import java.util.Date;
/**
 * ���㽱��Ķ���
 */
public class Prize {
	/**
	 * ����ĳ����ĳ��ʱ���ڵĽ�����Щ��������ʾ�в�����ʹ�ã�
	 * ������ʵ��ҵ��ʵ�����ǻ��õģ�Ϊ�˱�ʾ���Ǹ������ҵ�񷽷���
	 * �����Щ������������
	 * @param user �����㽱�����Ա
	 * @param begin ���㽱��Ŀ�ʼʱ��
	 * @param end ���㽱��Ľ���ʱ��
	 * @return ĳ����ĳ��ʱ���ڵĽ���
	 */
	public  double calcPrize(String user,Date begin,Date end){
		double prize = 0.0;
		
		//���㵱��ҵ�񽱽������˶������
		prize = this.monthPrize(user, begin, end);
		//�����ۼƽ���
		prize += this.sumPrize(user, begin, end);
		
		//��Ҫ�жϸ���Ա����ͨ��Ա����ҵ�����Ŷӽ���ֻ��ҵ�������
		if(this.isManager(user)){
			prize += this.groupPrize(user, begin, end);
		}
		
		return prize;
	}
	/**
	 * ����ĳ�˵ĵ���ҵ�񽱽𣬲����ظ����Ͳ���ע����
	 */
	private double monthPrize(String user, Date begin, Date end) {
		//���㵱��ҵ�񽱽�,������Աȥ��ȡ���µ�ҵ��Ȼ���ٳ���3%
		double prize = TempDB.mapMonthSaleMoney.get(user) * 0.03;
		System.out.println(user+"����ҵ�񽱽�"+prize);
		return prize;
	}
	/**
	 * ����ĳ�˵��ۼƽ��𣬲����ظ����Ͳ���ע����
	 */
	public double sumPrize(String user, Date begin, Date end) {
		//�����ۼƽ���,��ʵ����Ӧ�ð�����Աȥ��ȡ�ۼƵ�ҵ��Ȼ���ٳ���0.1%
		//����ʾһ�£��ٶ���ҵ��ۼ�ҵ����1000000Ԫ
		double prize = 1000000 * 0.001;
		System.out.println(user+"�ۼƽ���"+prize);
		return prize;
	}	
	/**
	 * �ж���Ա����ͨ��Ա����ҵ����
	 * @param user ���жϵ���Ա
	 * @return true��ʾ��ҵ����,false��ʾ����ͨ��Ա
	 */
	private boolean isManager(String user){
		//Ӧ�ô����ݿ��л�ȡ��Ա��Ӧ��ְ��
		//Ϊ����ʾ���򵥵��жϣ�ֻ�������Ǿ���
		if("����".equals(user)){
			return true;			
		}
		return false;
	}
	/**
	 * ���㵱���Ŷ�ҵ�񽱣������ظ����Ͳ���ע����
	 */
	public double groupPrize(String user, Date begin, Date end) {
		//���㵱���Ŷ�ҵ�񽱽��ȼ�����Ŷ��ܵ�ҵ��Ȼ���ٳ���1%�����趼��һ���Ŷӵ�
		double group = 0.0;
		for(double d : TempDB.mapMonthSaleMoney.values()){
			group += d;
		}
		double prize = group * 0.01;
		System.out.println(user+"�����Ŷ�ҵ�񽱽�"+prize);
		return prize;
	}
}

package com.bingo.code.example.design.builder.prototype.rewrite;
/**
 * ��������ҵ�����
 */
public class OrderBusiness {
	/**
	 * ���������ķ���
	 * @param order �����Ľӿڶ���
	 */
	public void saveOrder(OrderApi order){
		//����ҵ��Ҫ�󣬵�������Ԥ���Ĳ�Ʒ��������1000��ʱ�򣬾���Ҫ�Ѷ���������ݶ���
		//��Ȼ���Ҫ���ã������1000Ӧ�����ɳ�������ô����Ϊ����ʾ��
		
		//1���жϵ�ǰ��Ԥ����Ʒ�����Ƿ����1000
		while(order.getOrderProductNum() > 1000){
			//2��������ڣ�����Ҫ�������
			//2.1���½�һ�ݶ�����������Ķ�������������һ���⣬��������ͬ
			OrderApi newOrder = order.cloneOrder();
			//Ȼ����и�ֵ����Ʒ����Ϊ1000
			newOrder.setOrderProductNum(1000);
			
			//2.2ԭ���Ķ������������������óɼ���1000
			order.setOrderProductNum(order.getOrderProductNum()-1000);
			
			//Ȼ����ҵ���ܴ���ʡ���ˣ���ӡ�������һ��
			System.out.println("������ɶ���=="+newOrder);
		}		
		//3�����������Ǿ�ֱ��ҵ���ܴ���ʡ���ˣ���ӡ�������һ��
		System.out.println("����=="+order);
		
	}
}
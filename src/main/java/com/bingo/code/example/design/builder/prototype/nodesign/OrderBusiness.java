package com.bingo.code.example.design.builder.prototype.nodesign;
/**
 * ��������ҵ�����
 */
public class OrderBusiness {
	/**
	 * ���������ķ���
	 * @param order �����Ľӿڶ���
	 */
	public void saveOrder(OrderApi order){
		while(order.getOrderProductNum() > 1000){
			OrderApi newOrder = null;
			if(order instanceof PersonalOrder){
				PersonalOrder p2 = new PersonalOrder();
				PersonalOrder p1 = (PersonalOrder)order;
				p2.setCustomerName(p1.getCustomerName());
				p2.setProductId(p1.getProductId());			
				p2.setOrderProductNum(1000);
				newOrder = p2;
			}else if(order instanceof EnterpriseOrder){
				EnterpriseOrder e2 = new EnterpriseOrder();
				EnterpriseOrder e1 = (EnterpriseOrder)order;
				e2.setEnterpriseName(e1.getEnterpriseName());
				e2.setProductId(e1.getProductId());
				e2.setOrderProductNum(1000);
				newOrder = e2;
			}			
			
			order.setOrderProductNum(order.getOrderProductNum()-1000);
			
			System.out.println("������ɶ���=="+newOrder);
		}
		
		System.out.println("����=="+order);
		
	}
	
	public void saveOrder2(OrderApi order){
		int oldNum = order.getOrderProductNum();
		while(oldNum > 1000){
			OrderApi newOrder = null;

			if(order instanceof PersonalOrder){
				PersonalOrder p2 = new PersonalOrder();
				newOrder = p2;
			}else if(order instanceof EnterpriseOrder){
				EnterpriseOrder e2 = new EnterpriseOrder();
				newOrder = e2;
			}
		}
	}
}

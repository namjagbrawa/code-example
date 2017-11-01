package com.bingo.code.example.design.builder.prototype.deepclone;
/**
 * ���˶�������
 */
public class PersonalOrder implements OrderApi{
	/**
	 * ������Ա����
	 */
	private String customerName;
	/**
	 * ��Ʒ����
	 */
	private Product product = null;
	/**
	 * ������Ʒ����
	 */
	private int orderProductNum = 0;
	
	public int getOrderProductNum() {
		return this.orderProductNum;
	}	
	public void setOrderProductNum(int num) {
		this.orderProductNum = num;
	}	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public String toString(){
		//�򵥵����
		return "������Ʒ��="+this.product.getName()+"����������Ϊ="+this.orderProductNum;
	}
	
	public OrderApi cloneOrder() {
		//����һ���µĶ�����Ȼ��ѱ�ʵ�������ݸ��ƹ�ȥ
		PersonalOrder order = new PersonalOrder();
		order.setCustomerName(this.customerName);
		order.setOrderProductNum(this.orderProductNum);
		//���ڶ������͵����ݣ���ȿ�¡��ʱ����Ҫ���������������Ŀ�¡����
		order.setProduct((Product)this.product.cloneProduct());		
		return order;
	}
}

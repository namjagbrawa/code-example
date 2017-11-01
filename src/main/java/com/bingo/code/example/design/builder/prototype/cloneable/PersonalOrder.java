package com.bingo.code.example.design.builder.prototype.cloneable;
/**
 * ���˶�������,����Java��Clone����
 */
public class PersonalOrder implements Cloneable  , OrderApi{
	/**
	 * ������Ա����
	 */
	private String customerName;
	/**
	 * ��Ʒ���
	 */
	private String productId;
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
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String toString(){
		return "�����˶����Ķ�������="+this.customerName+"��������Ʒ��="+this.productId+"����������Ϊ="+this.orderProductNum;
	}
	public Object clone(){
		//��¡����������ʵ�֣�ֱ�ӵ��ø���Ŀ�¡�����Ϳ�����
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
}

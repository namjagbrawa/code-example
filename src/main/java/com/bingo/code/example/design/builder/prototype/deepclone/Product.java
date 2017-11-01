package com.bingo.code.example.design.builder.prototype.deepclone;
/**
 * ��Ʒ����
 */
public class Product implements ProductPrototype{
	/**
	 * ��Ʒ���
	 */
	private String productId;	
	/**
	 * ��Ʒ����
	 */
	private String name;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String toString(){
		return "��Ʒ���="+this.productId+"����Ʒ����="+this.name;
	}
	public ProductPrototype cloneProduct() {
		//����һ���µĶ�����Ȼ��ѱ�ʵ�������ݸ��ƹ�ȥ
		Product product = new Product();
		product.setProductId(this.productId);
		product.setName(this.name);		
		return product;
	}	
}

package com.bingo.code.example.design.builder.constraint;
/**
 * ���պ�ͬ�Ķ���
 */
public class InsuranceContract {
	/**
	 * ���պ�ͬ���
	 */
	private String contractId;
	/**
	 * ��������Ա�����ƣ�ͬһ�ݱ��պ�ͬ��Ҫô����Աǩ����Ҫô����˾ǩ����
	 * Ҳ����˵��"��������Ա"��"�����չ�˾"���������ԣ�������ͬʱ��ֵ
	 */
	private String personName;
	/**
	 * �����չ�˾������
	 */
	private String companyName;
	/**
	 * ���տ�ʼ��Ч������
	 */
	private long beginDate;
	/**
	 * ����ʧЧ�����ڣ�һ������ڱ��տ�ʼ��Ч������
	 */
	private long endDate;
	/**
	 * ʾ������������
	 */
	private String otherData;
	
	/**
	 * ���췽�������ʼ�����ͬ���ܷ���
	 */
	InsuranceContract(ConcreteBuilder builder){
		this.contractId = builder.getContractId();
		this.personName = builder.getPersonName();
		this.companyName = builder.getCompanyName();
		this.beginDate = builder.getBeginDate();
		this.endDate = builder.getEndDate();
		this.otherData = builder.getOtherData();
	}
	
	/**
	 * ʾ�⣺���պ�ͬ��ĳЩ����
	 */
	public void someOperation(){
		System.out.println("Now in Insurance Contract someOperation=="+this.contractId);
	}
}

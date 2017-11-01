package com.bingo.code.example.design.builder.insurance;
/**
 * ���챣�պ�ͬ����Ĺ�����
 */
public class ConcreteBuilder {
	private String contractId;
	private String personName;
	private String companyName;
	private long beginDate;
	private long endDate;
	private String otherData;
	/**
	 * ���췽�����������Ҫ�еĲ���
	 * @param contractId ���պ�ͬ���
	 * @param beginDate ���տ�ʼ��Ч������
	 * @param endDate ����ʧЧ������
	 */
	public ConcreteBuilder(String contractId,long beginDate,long endDate){
		this.contractId = contractId;
		this.beginDate = beginDate;
		this.endDate = endDate;
	}
	/**
	 * ѡ�����ݣ���������Ա������
	 * @param personName  ��������Ա������
	 * @return ����������
	 */
	public ConcreteBuilder setPersonName(String personName){
		this.personName = personName;
		return this;
	}
	/**
	 *  ѡ�����ݣ������չ�˾������
	 * @param companyName �����չ�˾������
	 * @return ����������
	 */
	public ConcreteBuilder setCompanyName(String companyName){
		this.companyName = companyName;
		return this;
	}
	/**
	 * ѡ�����ݣ���������
	 * @param otherData ��������
	 * @return ����������
	 */
	public ConcreteBuilder setOtherData(String otherData){
		this.otherData = otherData;
		return this;
	}
	/**
	 * ���������Ķ��󲢷���
	 * @return �����ı��պ�ͬ�Ķ���
	 */
	public InsuranceContract build(){
		return new InsuranceContract(this);
	}
	
	public String getContractId() {
		return contractId;
	}

	public String getPersonName() {
		return personName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public long getBeginDate() {
		return beginDate;
	}

	public long getEndDate() {
		return endDate;
	}

	public String getOtherData() {
		return otherData;
	}
}

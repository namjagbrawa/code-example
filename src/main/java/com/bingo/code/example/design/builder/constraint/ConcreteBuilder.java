package com.bingo.code.example.design.builder.constraint;
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
		if(contractId==null || contractId.trim().length()==0){
			throw new IllegalArgumentException("��ͬ��Ų���Ϊ��");
		}
		boolean signPerson = personName!=null && personName.trim().length()>0;
		boolean signCompany = companyName!=null && companyName.trim().length()>0;
		if(signPerson && signCompany){
			throw new IllegalArgumentException("һ�ݱ��պ�ͬ����ͬʱ���˺͹�˾ǩ��");
		}		
		if(signPerson==false && signCompany==false){
			throw new IllegalArgumentException("һ�ݱ��պ�ͬ����û��ǩ������");
		}
		if(beginDate<=0){
			throw new IllegalArgumentException("��ͬ�����б��տ�ʼ��Ч������");
		}
		if(endDate<=0){
			throw new IllegalArgumentException("��ͬ�����б���ʧЧ������");
		}
		if(endDate<=beginDate){
			throw new IllegalArgumentException("����ʧЧ�����ڱ�����ڱ�����Ч����");
		}
		
		
		
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

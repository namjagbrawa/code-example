package com.bingo.code.example.design.builder.inlineclass;
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
	 * ���췽�������ʼ�����˽�е�
	 */
	private InsuranceContract(ConcreteBuilder builder){
		this.contractId = builder.contractId;
		this.personName = builder.personName;
		this.companyName = builder.companyName;
		this.beginDate = builder.beginDate;
		this.endDate = builder.endDate;
		this.otherData = builder.otherData;
	}
	
	/**
	 * ���챣�պ�ͬ����Ĺ�����
	 */
	public static class ConcreteBuilder {
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
	}
	
	/**
	 * ʾ�⣺���պ�ͬ��ĳЩ����
	 */
	public void someOperation(){
		System.out.println("Now in Insurance Contract someOperation=="+this.contractId);
	}
}

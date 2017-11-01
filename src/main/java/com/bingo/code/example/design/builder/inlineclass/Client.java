package com.bingo.code.example.design.builder.inlineclass;

public class Client {
	public static void main(String[] args) {
		//����������
		InsuranceContract.ConcreteBuilder builder = new InsuranceContract.ConcreteBuilder("001",12345L,67890L);
		//������Ҫ�����ݣ�Ȼ�󹹽����պ�ͬ����
		InsuranceContract contract = builder.setPersonName("����").setOtherData("test").build();
		//�������պ�ͬ����ķ���
		contract.someOperation();
	}
}

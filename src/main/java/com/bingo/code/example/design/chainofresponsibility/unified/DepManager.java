package com.bingo.code.example.design.chainofresponsibility.unified;

public class DepManager extends Handler{

	
	public String handleFeeRequest(String user, double fee) {
		String str = "";
		//���ž����Ȩ��ֻ����1000����
		if(fee < 1000){
			//Ϊ�˲��ԣ��򵥵㣬ֻͬ��С�������
			if("С��".equals(user)){
				str = "���ž���ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
			}else{
				//������һ�ɲ�ͬ��
				str = "���ž���ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
			}
			return str;
		}else{
			//����1000���������ݸ�������ߵ��˴���
			if(this.successor!=null){
				return this.successor.handleFeeRequest(user, fee);
			}
		}
		return str;
	}
	
	public boolean handlePreFeeRequest(String user, double requestNum) {
		//���ž����Ȩ�ޱȽ�С��ֻ����20000����
		if(requestNum < 20000){
			//������Ҫ�ͳͳͬ��
			System.out.println("���ž���ͬ��"+user+"Ԥ֧���÷���"+requestNum+"Ԫ������");
			return true;
		}else{
			//����20000���������ݸ�������ߵ��˴���
			if(this.successor!=null){
				return this.successor.handlePreFeeRequest(user, requestNum);
			}
		}
		return false;
	}
}

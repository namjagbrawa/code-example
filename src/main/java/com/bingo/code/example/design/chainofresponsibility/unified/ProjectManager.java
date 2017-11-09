package com.bingo.code.example.design.chainofresponsibility.unified;

public class ProjectManager extends Handler{
	
	public String handleFeeRequest(String user, double fee) {
		String str = "";
		//��Ŀ�����Ȩ�ޱȽ�С��ֻ����500����
		if(fee < 500){
			//Ϊ�˲��ԣ��򵥵㣬ֻͬ��С���
			if("С��".equals(user)){
				str = "��Ŀ����ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
			}else{
				//������һ�ɲ�ͬ��
				str = "��Ŀ����ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
			}
			return str;
		}else{
			//����500���������ݸ�������ߵ��˴���
			if(this.successor!=null){
				return successor.handleFeeRequest(user, fee);
			}
		}
		return str;
	}

	
	public boolean handlePreFeeRequest(String user, double requestNum) {
		//��Ŀ�����Ȩ�ޱȽ�С��ֻ����5000����
		if(requestNum < 5000){
			//������Ҫ�ͳͳͬ��
			System.out.println("��Ŀ����ͬ��"+user+"Ԥ֧���÷���"+requestNum+"Ԫ������");
			return true;
		}else{
			//����5000���������ݸ�������ߵ��˴���
			if(this.successor!=null){
				return this.successor.handlePreFeeRequest(user, requestNum);
			}
		}
		return false;
	}

}

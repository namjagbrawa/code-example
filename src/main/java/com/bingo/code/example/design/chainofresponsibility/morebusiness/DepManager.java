package com.bingo.code.example.design.chainofresponsibility.morebusiness;
/**
 * ʵ�ֲ��ž�����۲ͷ�������Ķ��� 
 */
public class DepManager extends Handler{
	public Object handleRequest(RequestModel rm){		
		if(FeeRequestModel.FEE_TYPE.equals(rm.getType())){
			return handleFeeRequest(rm);
		}else{
			return super.handleRequest(rm);
		}
	}
	private Object handleFeeRequest(RequestModel rm) {
		//�Ȱ�ͨ�õĶ������ͻ���
		FeeRequestModel frm = (FeeRequestModel)rm;
		String str = "";
		//���ž����Ȩ��ֻ����1000����
		if(frm.getFee() < 1000){
			//Ϊ�˲��ԣ��򵥵㣬ֻͬ��С�������
			if("С��".equals(frm.getUser())){
				str = "���ž���ͬ��"+frm.getUser()+"�۲ͷ���"+frm.getFee()+"Ԫ������";
			}else{
				//������һ�ɲ�ͬ��
				str = "���ž���ͬ��"+frm.getUser()+"�۲ͷ���"+frm.getFee()+"Ԫ������";
			}
			return str;
		}else{
			//����1000���������ݸ�������ߵ��˴���
			if(this.successor!=null){
				return this.successor.handleRequest(rm);
			}
		}
		return str;
	}
}

package com.bingo.code.example.design.chainofresponsibility.morebusiness;
/**
 * ʵ���ܾ�����۲ͷ�������Ķ��� 
 */
public class GeneralManager extends Handler{
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
		//�ܾ����Ȩ�޺ܴ�ֻҪ����������������Դ���
		if(frm.getFee() >= 1000){
			//Ϊ�˲��ԣ��򵥵㣬ֻͬ��С���
			if("С��".equals(frm.getUser())){
				str = "�ܾ���ͬ��"+frm.getUser()+"�۲ͷ���"+frm.getFee()+"Ԫ������";
			}else{
				//������һ�ɲ�ͬ��
				str = "�ܾ���ͬ��"+frm.getUser()+"�۲ͷ���"+frm.getFee()+"Ԫ������";
			}
			return str;
		}else{
			//������к�̵Ĵ�����󣬼�������
			if(this.successor!=null){
				return successor.handleRequest(rm);
			}
		}
		return str;
	}
}

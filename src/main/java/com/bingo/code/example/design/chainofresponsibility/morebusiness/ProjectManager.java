package com.bingo.code.example.design.chainofresponsibility.morebusiness;
/**
 * ʵ����Ŀ������۲ͷ�������Ķ��� 
 */
public class ProjectManager extends Handler{
	public Object handleRequest(RequestModel rm){
		if(FeeRequestModel.FEE_TYPE.equals(rm.getType())){
			//��ʾ�۲ͷ�������
			return handleFeeRequest(rm);
		}else{
			//��������Ŀ������ʱ���봦��
			return super.handleRequest(rm);
		}
	}
	private Object handleFeeRequest(RequestModel rm) {
		//�Ȱ�ͨ�õĶ������ͻ���
		FeeRequestModel frm = (FeeRequestModel)rm;
		String str = "";
		//��Ŀ�����Ȩ�ޱȽ�С��ֻ����500����
		if(frm.getFee() < 500){
			//Ϊ�˲��ԣ��򵥵㣬ֻͬ��С���
			if("С��".equals(frm.getUser())){
				str = "��Ŀ����ͬ��"+frm.getUser()+"�۲ͷ���"+frm.getFee()+"Ԫ������";
			}else{
				//������һ�ɲ�ͬ��
				str = "��Ŀ����ͬ��"+frm.getUser()+"�۲ͷ���"+frm.getFee()+"Ԫ������";
			}
			return str;
		}else{
			//����500���������ݸ�������ߵ��˴���
			if(this.successor!=null){
				return successor.handleRequest(rm);
			}
		}
		return str;
	}
}

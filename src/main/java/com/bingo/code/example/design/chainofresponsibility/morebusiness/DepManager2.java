package com.bingo.code.example.design.chainofresponsibility.morebusiness;
/**
 * ʵ�ֲ��ž�����Ԥ֧���÷�������Ķ��� 
 */
public class DepManager2 extends DepManager{
	public Object handleRequest(RequestModel request){
		if(PreFeeRequestModel.FEE_TYPE.equals(request.getType())){
			//��ʾԤ֧���÷�������
			return myHandler(request);
		}else{
			//�������ø���ȥ����
			return super.handleRequest(request);
		}
	}
	private Object myHandler(RequestModel request) {
		//�Ȱ�ͨ�õĶ������ͻ���
		PreFeeRequestModel fr = (PreFeeRequestModel)request;
		//���ž����Ȩ�ޱȽ�С��ֻ����20000����
		if(fr.getFee() < 20000){
			//������Ҫ�ͳͳͬ��
			System.out.println("���ž���ͬ��"+fr.getUser()+"Ԥ֧���÷���"+fr.getFee()+"Ԫ������");
			return true;
		}else{
			//����20000���������ݸ�������ߵ��˴���
			if(this.successor != null){
				return this.successor.handleRequest(request);
			}
		}
		return false;
	}
}

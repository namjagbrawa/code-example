package com.bingo.code.example.design.chainofresponsibility.morebusiness;
/**
 * ʵ��Ϊ��Ŀ��������Ԥ֧���÷������봦��Ĺ��ܵ��Ӷ���
 * ���ڵ���Ŀ����ȿ��Դ���۲ͷ������룬�ֿ��Դ���Ԥ֧���÷�������
 */
public class ProjectManager2 extends ProjectManager{
	public Object handleRequest(RequestModel rm){
		if(PreFeeRequestModel.FEE_TYPE.equals(rm.getType())){
			//��ʾԤ֧���÷�������
			return myHandler(rm);
		}else{
			//�������ø���ȥ����
			return super.handleRequest(rm);
		}
	}
	private Object myHandler(RequestModel rm) {
		//�Ȱ�ͨ�õĶ������ͻ���
		PreFeeRequestModel frm = (PreFeeRequestModel)rm;
		//��Ŀ�����Ȩ�ޱȽ�С��ֻ����5000����
		if(frm.getFee() < 5000){
			//������Ҫ�ͳͳͬ��
			System.out.println("��Ŀ����ͬ��"+frm.getUser()+"Ԥ֧���÷���"+frm.getFee()+"Ԫ������");
			return true;
		}else{
			//����5000���������ݸ�������ߵ��˴���
			if(this.successor!=null){
				return this.successor.handleRequest(rm);
			}
		}
		return false;
	}
}

package com.bingo.code.example.design.chainofresponsibility.nodesign;
/**
 * ����۲ͷ�������Ķ���
 */
public class FeeRequest {
	/**
	 * �ύ�۲ͷ����������Ŀ����
	 * @param user ������
	 * @param fee �������
	 * @return �ɹ���ʧ�ܵľ���֪ͨ
	 */
	public String requestToProjectManager(String user,double fee){
		String str = "";
		if(fee < 500){
			//��Ŀ�����Ȩ�ޱȽ�С��ֻ����500����
			str = this.projectHandle(user, fee);
		}else if(fee < 1000){
			//���ž����Ȩ��ֻ����1000����
			str = this.depManagerHandle(user, fee);
		}else if(fee >= 1000){
			//�ܾ����Ȩ�޺ܴ�ֻҪ����������������Դ���
			str = this.generalManagerHandle(user, fee);
		}
		return str;
	}
	/**
	 * ��Ŀ���������������룬����������ֵ��������һ���ģ�ʡ����
	 */
	private String projectHandle(String user, double fee) {
		String str = "";
		//Ϊ�˲��ԣ��򵥵㣬ֻͬ��С���
		if("С��".equals(user)){
			str = "��Ŀ����ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
		}else{
			//������һ�ɲ�ͬ��
			str = "��Ŀ����ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
		}
		return str;
	}
	/**
	 * ���ž��������������룬����������ֵ��������һ���ģ�ʡ����
	 */
	private String depManagerHandle(String user, double fee) {
		String str = "";
		//Ϊ�˲��ԣ��򵥵㣬ֻͬ��С�������
		if("С��".equals(user)){
			str = "���ž���ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
		}else{
			//������һ�ɲ�ͬ��
			str= "���ž���ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
		}
		return str;
	}
	/**
	 * �ܾ��������������룬����������ֵ��������һ���ģ�ʡ����
	 */
	private String generalManagerHandle(String user, double fee) {
		String str = "";
		
		//Ϊ�˲��ԣ��򵥵㣬ֻͬ��С���
		if("С��".equals(user)){
			str = "�ܾ���ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
		}else{
			//������һ�ɲ�ͬ��
			str = "�ܾ���ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
		}
		return str;
	}
	
}

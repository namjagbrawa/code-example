package com.bingo.code.example.design.state.leaverequestcomplete;
/**
 * ��ٵ�����
 */
public class LeaveRequestModel {
	/**
	 * �����
	 */
	private String user;
	/**
	 * ��ٿ�ʼʱ��
	 */
	private String beginDate;
	/**
	 * �������
	 */
	private int leaveDays;
	/**
	 * ��˽��
	 */
	private String result;
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getUser() {
		return user;
	}

	public String getBeginDate() {
		return beginDate;
	}

	public int getLeaveDays() {
		return leaveDays;
	}
	public void setUser(String user) {
		this.user = user;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}	
}

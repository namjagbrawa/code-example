package com.bingo.code.example.design.state.rewrite;
/**
 * ��װһ��ͶƱ״̬��ص���Ϊ
 */
public interface VoteState {
	/**
	 * ����״̬��Ӧ����Ϊ
	 * @param user ͶƱ��
	 * @param voteItem ͶƱ��
	 * @param voteManager ͶƱ�����ģ�������ʵ��״̬��Ӧ�Ĺ��ܴ����ʱ��
	 *                    ���Իص������ĵ�����
	 */
	public void vote(String user, String voteItem, VoteManager voteManager);
}
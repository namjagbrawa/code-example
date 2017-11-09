package com.bingo.code.example.design.state.instate;

public class BlackWarnVoteState implements VoteState{
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//��������������״̬
		System.out.println("��ֹ��¼��ʹ��ϵͳ3��");
		
		//��������������״̬������ɣ�ά����һ��״̬��ͶƱ��10�Σ��ͽ���������
		//ע���������жϴ��ڵ���9����Ϊ�������õ�����һ��״̬
		//��һ��������������10�ˣ���Ӧ�����ǽ���������
		if(voteManager.getMapVoteCount().get(user) >= 9){
			voteManager.getMapState().put(user, new BlackVoteState());
		}
	}
}

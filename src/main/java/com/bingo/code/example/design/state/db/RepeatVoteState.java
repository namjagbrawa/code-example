package com.bingo.code.example.design.state.db;

public class RepeatVoteState implements VoteState{
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//�ظ�ͶƱ
		//��ʱ��������
		System.out.println("�벻Ҫ�ظ�ͶƱ");
		
		//�ظ�ͶƱ��ɣ�ά����һ��״̬���ظ�ͶƱ��5�Σ��������ͶƱ��
		//ע���������жϴ��ڵ���4����Ϊ�������õ�����һ��״̬
		//��һ��������������5�ˣ���Ӧ�����Ƕ���ͶƱ��
		if(voteManager.getMapVoteCount().get(user) >= 4){
			voteManager.getMapState().put(user, new SpiteVoteState());
			//把下一个状态的编码记录到数据库
		}
	}
}
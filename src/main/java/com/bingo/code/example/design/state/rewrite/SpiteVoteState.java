package com.bingo.code.example.design.state.rewrite;

public class SpiteVoteState implements VoteState{
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//����ͶƱ
		//ȡ���û���ͶƱ�ʸ񣬲�ȡ��ͶƱ��¼
		String s = voteManager.getMapVote().get(user);
		if(s!=null){
			voteManager.getMapVote().remove(user);
		}
		System.out.println("���ж���ˢƱ��Ϊ��ȡ��ͶƱ�ʸ�");
	}
}
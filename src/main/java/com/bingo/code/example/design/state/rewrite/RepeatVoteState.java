package com.bingo.code.example.design.state.rewrite;

public class RepeatVoteState implements VoteState{
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//�ظ�ͶƱ
		//��ʱ��������
		System.out.println("�벻Ҫ�ظ�ͶƱ");
	}
}
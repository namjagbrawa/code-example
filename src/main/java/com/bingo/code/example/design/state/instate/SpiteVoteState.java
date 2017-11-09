package com.bingo.code.example.design.state.instate;

public class SpiteVoteState implements VoteState{
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//����ͶƱ
		//ȡ���û���ͶƱ�ʸ񣬲�ȡ��ͶƱ��¼
		String s = voteManager.getMapVote().get(user);
		if(s!=null){
			voteManager.getMapVote().remove(user);
		}
		System.out.println("���ж���ˢƱ��Ϊ��ȡ��ͶƱ�ʸ�");
		
		//����ͶƱ��ɣ�ά����һ��״̬��ͶƱ��8�Σ��ͽ���������
		//ע���������жϴ��ڵ���7����Ϊ�������õ�����һ��״̬
		//��һ��������������8�ˣ���Ӧ�����ǽ���������
		if(voteManager.getMapVoteCount().get(user) >= 7){
			voteManager.getMapState().put(user, new BlackVoteState());
		}
	}
}
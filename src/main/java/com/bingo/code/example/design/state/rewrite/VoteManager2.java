package com.bingo.code.example.design.state.rewrite;
import java.util.*;
/**
 * ͶƱ����
 */
public class VoteManager2 {
	/**
	 * ����״̬�������
	 */
	private VoteState state = null;
	/**
	 * ��¼�û�ͶƱ�Ľ��,Map<String,String>��ӦMap<�û�����,ͶƱ��ѡ��>
	 */
	private Map<String,String> mapVote = new HashMap<String,String>();
	/**
	 * ��¼�û�ͶƱ����,Map<String,Integer>��ӦMap<�û�����,ͶƱ�Ĵ���>
	 */
	private Map<String,Integer> mapVoteCount = new HashMap<String,Integer>();
	
	/**
	 * ��ȡ��¼�û�ͶƱ�����Map
	 * @return ��¼�û�ͶƱ�����Map
	 */
	public Map<String, String> getMapVote() {
		return mapVote;
	}
	
	/**
	 * ͶƱ
	 * @param user ͶƱ�ˣ�Ϊ�˼򵥣������û�����
	 * @param voteItem ͶƱ��ѡ��
	 */
	public void vote(String user,String voteItem){
		//1����Ϊ���û�����ͶƱ�Ĵ���
		//�ȴӼ�¼��ȡ�����е�ͶƱ����
		Integer oldVoteCount = mapVoteCount.get(user);
		if(oldVoteCount==null){
			oldVoteCount = 0;
		}
		oldVoteCount = oldVoteCount + 1;
		mapVoteCount.put(user, oldVoteCount);
		
		//2���жϸ��û�ͶƱ�����ͣ����൱�����ж϶�Ӧ��״̬
		//����������ͶƱ���ظ�ͶƱ������ͶƱ�����Ϻ�������״̬
		if(oldVoteCount==1){
			state = new NormalVoteState();
		}else if(oldVoteCount>1 && oldVoteCount<5){
			state = new RepeatVoteState();
		}else if(oldVoteCount >= 5 && oldVoteCount<8){
			state = new SpiteVoteState();
		}else if(oldVoteCount>=8 && oldVoteCount<10){
			state = new BlackWarnVoteState();
		}else if(oldVoteCount>10){
			state = new BlackVoteState();
		}
		//Ȼ��ת��״̬������������Ӧ�Ĳ���
//		state.vote(user, voteItem, this);
	}
}

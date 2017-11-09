package com.bingo.code.example.design.state.instate;
import java.util.*;
/**
 * ͶƱ����
 */
public class VoteManager {
	/**
	 * ��¼��ǰÿ���û���Ӧ��״̬�������ÿ���û���ǰ��״̬�ǲ�ͬ��
	 * Map<String,VoteState>��ӦMap<�û�����,��ǰ��Ӧ��״̬�������>
	 */
	private Map<String,VoteState> mapState = new HashMap<String,VoteState>();

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
	 * ��ȡ��¼ÿ���û���Ӧ��״̬��������Map
	 * @return ��¼ÿ���û���Ӧ��״̬��������Map
	 */
	public Map<String, VoteState> getMapState() {
		return mapState;
	}
	/**
	 * ��ȡ��¼ÿ���û���Ӧ��ͶƱ������Map
	 * @return ��¼ÿ���û���Ӧ��ͶƱ������Map
	 */
	public Map<String, Integer> getMapVoteCount() {
		return mapVoteCount;
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

		//2����ȡ���û���ͶƱ״̬
		VoteState state = mapState.get(user);
		//���û��ͶƱ״̬��˵����û��Ͷ��Ʊ���ͳ�ʼ��һ������ͶƱ״̬
		if(state==null){
			state = new NormalVoteState();
		}
		
		//Ȼ��ת��״̬������������Ӧ�Ĳ���
		state.vote(user, voteItem, this);
	}
}

package com.bingo.code.example.design.state.db;
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
	 * ��ȡ��¼ÿ���û���Ӧ��״̬��������Map
	 * @return ��¼ÿ���û���Ӧ��״̬��������Map
	 */
	public Map<String, VoteState> getMapState() {
		return mapState;
	}
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
	public void vote(String user,String voteItem)throws Exception{
		//1����Ϊ���û�����ͶƱ�Ĵ���
		//�ȴӼ�¼��ȡ�����е�ͶƱ����
		Integer oldVoteCount = mapVoteCount.get(user);
		if(oldVoteCount==null){
			oldVoteCount = 0;
		}
		oldVoteCount = oldVoteCount + 1;
		mapVoteCount.put(user, oldVoteCount);

		VoteState state = null;
		//2��ֱ�Ӵ����ݿ��ȡ���û���Ӧ����һ��״̬��״̬����
		String stateId = "�����ݿ��л�ȡ���ֵ";
		//��ʼ����״̬�������������õ�״̬����
		
		//����״̬����ȥ��ȡ��Ӧ����
		String className = "����״̬����ȥ��ȡ��Ӧ����";
		//ʹ�÷��䴴������ʵ������ʾ��һ��
		Class c = Class.forName(className);
		state = (VoteState)c.newInstance();
		
		if("����ͶƱ".equals(stateId)){
			state = new NormalVoteState();
		}else if("�ظ�ͶƱ".equals(stateId)){
			state = new RepeatVoteState(); 
		}else if("����ͶƱ".equals(stateId)){
			state = new SpiteVoteState(); 
		}else if("������".equals(stateId)){
			state = new BlackVoteState(); 
		}
		//Ȼ��ת��״̬������������Ӧ�Ĳ���
		state.vote(user, voteItem, this);
	}
}

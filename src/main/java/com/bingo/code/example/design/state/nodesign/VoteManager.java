package com.bingo.code.example.design.state.nodesign;

import java.util.HashMap;
import java.util.Map;

/**
 * ͶƱ����
 */
public class VoteManager {
    /**
     * ��¼�û�ͶƱ�Ľ��,Map<String,String>��ӦMap<�û�����,ͶƱ��ѡ��>
     */
    private Map<String, String> mapVote = new HashMap<String, String>();
    /**
     * ��¼�û�ͶƱ����,Map<String,Integer>��ӦMap<�û�����,ͶƱ�Ĵ���>
     */
    private Map<String, Integer> mapVoteCount = new HashMap<String, Integer>();

    /**
     * ͶƱ
     *
     * @param user     ͶƱ�ˣ�Ϊ�˼򵥣������û�����
     * @param voteItem ͶƱ��ѡ��
     */
    public void vote(String user, String voteItem) {
        //1����Ϊ���û�����ͶƱ�Ĵ���
        //�ȴӼ�¼��ȡ�����е�ͶƱ����
        Integer oldVoteCount = mapVoteCount.get(user);
        if (oldVoteCount == null) {
            oldVoteCount = 0;
        }
        oldVoteCount = oldVoteCount + 1;
        mapVoteCount.put(user, oldVoteCount);

        //2���жϸ��û�ͶƱ�����ͣ�����������ͶƱ���ظ�ͶƱ������ͶƱ�����Ϻ�����
        //Ȼ�����ͶƱ������������Ӧ�Ĳ���
        if (oldVoteCount == 1) {
            //����ͶƱ
            //��¼��ͶƱ��¼��
            mapVote.put(user, voteItem);
            System.out.println("��ϲ��ͶƱ�ɹ�");
        } else if (oldVoteCount > 1 && oldVoteCount < 5) {
            //�ظ�ͶƱ
            //��ʱ��������
            System.out.println("�벻Ҫ�ظ�ͶƱ");
        } else if (oldVoteCount >= 5 && oldVoteCount < 8) {
            //����ͶƱ
            //ȡ���û���ͶƱ�ʸ񣬲�ȡ��ͶƱ��¼
            String s = mapVote.get(user);
            if (s != null) {
                mapVote.remove(user);
            }
            System.out.println("���ж���ˢƱ��Ϊ��ȡ��ͶƱ�ʸ�");
        } else if (oldVoteCount >= 8) {
            //������
            //����������У���ֹ��¼ϵͳ��
            System.out.println("���������������ֹ��¼��ʹ�ñ�ϵͳ");
        }
    }
}

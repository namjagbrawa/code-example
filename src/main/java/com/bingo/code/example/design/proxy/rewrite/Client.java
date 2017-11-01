package com.bingo.code.example.design.proxy.rewrite;
import java.util.*;
public class Client {
	public static void main(String[] args) throws Exception{
		UserManager userManager = new UserManager();
		Collection<UserModelApi> col = userManager.getUserByDepId("0101");

		//���ֻ����ʾ�û����ƣ���ô����Ҫ���²�ѯ���ݿ�
		for(UserModelApi umApi : col){
			System.out.println("�û���ţ�="+umApi.getUserId()+",�û�������="+umApi.getName());
		}
		//������ʷ��û���ź��û�����������ԣ��Ǿͻ����²�ѯ���ݿ�
		for(UserModelApi umApi : col){
			System.out.println("�û���ţ�="+umApi.getUserId()+",�û�������="+umApi.getName()+",�������ţ�="+umApi.getDepId());
		}
	}
}
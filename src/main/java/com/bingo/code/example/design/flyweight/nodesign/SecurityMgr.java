package com.bingo.code.example.design.flyweight.nodesign;
import java.util.*;
/**
 * ��ȫ����ʵ�ֳɵ���
 */
public class SecurityMgr {
	private static SecurityMgr securityMgr = new SecurityMgr();
	private SecurityMgr(){		
	}
	public static SecurityMgr getInstance(){
		return securityMgr;
	}
	
	/**
	 * �������ڼ䣬������ŵ�¼��Ա��Ӧ��Ȩ�ޣ�
	 * ��WebӦ���У���Щ����ͨ�����ŵ�session��
	 */
	private Map<String,Collection<AuthorizationModel>> map = 
		new HashMap<String,Collection<AuthorizationModel>>();
	
	/**
	 * ģ���¼�Ĺ���
	 * @param user ��¼���û�
	 */
	public void login(String user){
		//��¼��ʱ�����Ҫ�Ѹ��û���ӵ�е�Ȩ�ޣ������ݿ���ȡ�������ŵ�������ȥ
		Collection<AuthorizationModel> col = queryByUser(user);
		map.put(user, col);
	}
	/**
	 * �ж�ĳ�û���ĳ����ȫʵ���Ƿ�ӵ��ĳȨ��
	 * @param user �����Ȩ�޵��û� 
	 * @param securityEntity ��ȫʵ��
	 * @param permit Ȩ��
	 * @return true��ʾӵ����ӦȨ�ޣ�false��ʾû����ӦȨ��
	 */
	public boolean hasPermit(String user,String securityEntity,String permit){
		Collection<AuthorizationModel> col = map.get(user);
		if(col==null || col.size()==0){
			System.out.println(user+"û�е�¼����û�б������κ�Ȩ��");
			return false;
		}
		for(AuthorizationModel am : col){
			//�����ǰʵ���������Ƿ�ͬһ��ʵ������
			System.out.println("am=="+am);
			if(am.getSecurityEntity().equals(securityEntity) 
					&& am.getPermit().equals(permit)){
				return true;
			}
		}
		return false;
	}
	/**
	 * �����ݿ��л�ȡĳ����ӵ�е�Ȩ��
	 * @param user ��Ҫ��ȡ��ӵ�е�Ȩ�޵���Ա
	 * @return ĳ����ӵ�е�Ȩ��
	 */
	private Collection<AuthorizationModel> queryByUser(String user){
		Collection<AuthorizationModel> col = new ArrayList<AuthorizationModel>();
		
		for(String s : TestDB.colDB){
			String ss[] = s.split(",");
			if(ss[0].equals(user)){
				AuthorizationModel am = new AuthorizationModel();
				am.setUser(ss[0]);
				am.setSecurityEntity(ss[1]);
				am.setPermit(ss[2]);
				
				col.add(am);
			}
		}
		return col;
	}
	
}

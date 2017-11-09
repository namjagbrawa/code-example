package com.bingo.code.example.design.flyweight.clearcache;
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
	 * �ж�ĳ�û���ĳ����ȫʵ���Ƿ�ӵ��ĳȨ��
	 * @param user �����Ȩ�޵��û� 
	 * @param securityEntity ��ȫʵ��
	 * @param permit Ȩ��
	 * @return true��ʾӵ����ӦȨ�ޣ�false��ʾû����ӦȨ��
	 */
	public boolean hasPermit(String user,String securityEntity,String permit){
		Collection<Flyweight> col = this.queryByUser(user);
		if(col==null || col.size()==0){
			System.out.println(user+"û�е�¼����û�б������κ�Ȩ��");
			return false;
		}
		for(Flyweight fm : col){
			if(fm.match(securityEntity, permit)){
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
	private Collection<Flyweight> queryByUser(String user){
		Collection<Flyweight> col = new ArrayList<Flyweight>();
		
		for(String s : TestDB.colDB){
			String ss[] = s.split(",");
			if(ss[0].equals(user)){
				Flyweight fm = null;
				if(ss[3].equals("2")){
					//��ʾ�����
					fm = new UnsharedConcreteFlyweight();
					//��ȡ��Ҫ��ϵ�����
					String tempSs[] = TestDB.mapDB.get(ss[1]);
					for(String tempS : tempSs){
						Flyweight tempFm = FlyweightFactory.getInstance().getFlyweight(tempS);
						//�����������뵽��϶�����
						fm.add(tempFm);
					}
				}else{
					fm = FlyweightFactory.getInstance().getFlyweight(ss[1]+","+ss[2]);
				}
				
				col.add(fm);
			}
		}
		return col;
	}	
}


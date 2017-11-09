package com.bingo.code.example.design.flyweight.unshared;
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
	private Map<String,Collection<Flyweight>> map = 
		new HashMap<String,Collection<Flyweight>>();
	
	/**
	 * ģ���¼�Ĺ���
	 * @param user ��¼���û�
	 */
	public void login(String user){
		//��¼��ʱ�����Ҫ�Ѹ��û���ӵ�е�Ȩ�ޣ������ݿ���ȡ�������ŵ�������ȥ
		Collection<Flyweight> col = queryByUser(user);
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
		Collection<Flyweight> col = map.get(user);
		System.out.println("���ڲ���"+securityEntity+"��"+permit+"Ȩ�ޣ�map.size="+map.size());
		if(col==null || col.size()==0){
			System.out.println(user+"û�е�¼����û�б������κ�Ȩ��");
			return false;
		}
		for(Flyweight fm : col){
			//�����ǰʵ���������Ƿ�ͬһ��ʵ������
			System.out.println("fm=="+fm);
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


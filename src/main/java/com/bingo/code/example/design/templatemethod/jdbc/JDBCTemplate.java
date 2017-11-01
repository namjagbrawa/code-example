package com.bingo.code.example.design.templatemethod.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
/**
 * һ���򵥵�ʵ��JDBC��ɾ�Ĳ鹦�ܵ�ģ��
 */
public abstract class JDBCTemplate {
	/**
	 * ���嵱ǰ�Ĳ�������������
	 */
	protected final static int TYPE_CREATE = 1;
	/**
	 * ���嵱ǰ�Ĳ����������޸�
	 */
	protected final static int TYPE_UPDATE = 2;
	/**
	 * ���嵱ǰ�Ĳ���������ɾ��
	 */
	protected final static int TYPE_DELETE = 3;
	/**
	 * ���嵱ǰ�Ĳ��������ǰ�������ѯ
	 */
	protected final static int TYPE_CONDITION = 4;
	
/*---------------------ģ�巽��---------------------*/	
	/**
	 * ʵ�������Ĺ���
	 * @param obj ��Ҫ�����������ݶ���
	 */
	public final void create(Object obj){
		//1����ȡ������sql
		String sql = this.getMainSql(TYPE_CREATE);
		//2������ͨ�õĸ���ʵ��
		this.executeUpdate(sql, TYPE_CREATE,obj);
	}
	/**
	 * ʵ���޸ĵĹ���
	 * @param obj ��Ҫ���޸ĵ����ݶ���
	 */
	public final void update(Object obj){
		//1����ȡ�޸ĵ�sql
		String sql = this.getMainSql(TYPE_UPDATE);
		//2������ͨ�õĸ���ʵ��
		this.executeUpdate(sql, TYPE_UPDATE,obj);
	}
	/**
	 * ʵ��ɾ���Ĺ���
	 * @param obj ��Ҫ��ɾ�������ݶ���
	 */
	public final void delete(Object obj){
		//1����ȡɾ����sql
		String sql = this.getMainSql(TYPE_DELETE);
		//2������ͨ�õĸ���ʵ��
		this.executeUpdate(sql, TYPE_DELETE,obj);
	}
	/**
	 * ʵ�ְ���������ѯ�Ĺ���
	 * @param qm ��װ��ѯ���������ݶ���
	 * @return �������������ݶ��󼯺�
	 */
	public final Collection getByCondition(Object qm){
		//1����ȡ��ѯ��sql
		String sql = this.getMainSql(TYPE_CONDITION);
		//2������ͨ�õĲ�ѯʵ��
		return this.getByCondition(sql, qm);
	}
	
	
/*---------------------ԭ�����---------------------*/		
	/**
	 * ��ȡ������Ҫ������sql
	 * @param type ��������
	 * @return ������Ӧ������sql
	 */
	protected abstract String getMainSql(int type);
	/**
	 * Ϊ���²�����sql�е�"?"����ֵ
	 * @param type ��������
	 * @param pstmt PreparedStatement����
	 * @param obj ���������ݶ���
	 * @throws Exception
	 */
	protected abstract void setUpdateSqlValue(int type,PreparedStatement pstmt,Object obj) throws Exception;
	
	/**
	 * Ϊͨ�ò�ѯ��̬��ƴ��sql���������֣�����˼·�ǣ�
	 * ֻ���û���д����Ӧ����������ô����sql����Ӷ�Ӧ������
	 * @param sql sql�����ɲ���
	 * @param qm ��װ��ѯ����������ģ��
	 * @return ƴ�Ӻõ�sql���
	 */
	protected abstract String prepareQuerySql(String sql,Object qm);
	/**
	 * Ϊͨ�ò�ѯ��sql��̬����������ֵ
	 * @param pstmt Ԥ�����ѯsql�Ķ���
	 * @param qm ��װ��ѯ����������ģ��
	 * @throws Exception
	 */
	protected abstract void setQuerySqlValue(PreparedStatement pstmt,Object qm)throws Exception;
	/**
	 * �Ѳ�ѯ���صĽ����ת����Ϊ���ݶ���
	 * @param rs ��ѯ���صĽ����
	 * @return ��ѯ���صĽ����ת����Ϊ���ݶ���
	 * @throws Exception
	 */
	protected abstract Object rs2Object(ResultSet rs)throws Exception;
	
/*---------------------���Ӳ���---------------------*/		
	/**
	 * �������ݿ��Ĭ��ʵ�֣����Ա����า��
	 * @return ���ݿ�����
	 * @throws Exception
	 */
	protected Connection getConnection()throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl",
				"test","test");
	}
	/**
	 * ִ�в�ѯ
	 * @param sql ��ѯ������sql���
	 * @param qm ��װ��ѯ����������ģ��
	 * @return ��ѯ��Ľ�����󼯺�
	 */
	protected  Collection getByCondition(String sql,Object qm){
		Collection col = new ArrayList();
		Connection conn = null;
		try{
			//���ù��ӷ���
			conn = this.getConnection();
			//����ԭ�����
			sql = this.prepareQuerySql(sql, qm);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//����ԭ�����
			this.setQuerySqlValue(pstmt, qm);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				//����ԭ�����
				col.add(this.rs2Object(rs));
			}
			rs.close();
			pstmt.close();
		}catch(Exception err){
			err.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return col;
	}
	/**
	 * ִ�и������ݵ�sql��䣬������ɾ�ĵĹ���
	 * @param sql ��Ҫִ�е�sql���
	 * @param callback �ص��ӿڣ��ص�Ϊsql��丳ֵ�ķ���
	 */
	protected  void executeUpdate(String sql,int type,Object obj){
		Connection conn = null;
		try{
			//���ù��ӷ���			
			conn = this.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//����ԭ�����
			this.setUpdateSqlValue(type,pstmt,obj);			
			pstmt.executeUpdate();			
			pstmt.close();
		}catch(Exception err){
			err.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

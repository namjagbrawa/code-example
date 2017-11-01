package com.bingo.code.example.design.templatemethod.jdbc;
/**
 * ������ѯ�û����������ݵ�ģ��
 */
public class UserQueryModel extends UserModel{
	/**
	 * ������һ�������ѯ��Ҳ���������ѯ�����������ǣ�
	 * age >= ����ֵ1  and  age <= ����ֵ2 
	 * ��UserModel�е�age��������ֵ1��
	 * ���ﶨ���age2��������ֵ2
	 */
	private int age2;

	public int getAge2() {
		return age2;
	}

	public void setAge2(int age2) {
		this.age2 = age2;
	}
}

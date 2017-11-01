package com.bingo.code.example.design.command.computer;
/**
 * ���������࣬�������������ʵ���ߣ���Commandģʽ�г䵱Receiver
 */
public class GigaMainBoard implements MainBoardApi{
	/**
	 * �����Ŀ��������ʵ��
	 */
	public void open(){
		System.out.println("���������������ڿ�������Ⱥ�");
		System.out.println("��ͨ��Դ......");
		System.out.println("�豸���......");
		System.out.println("װ��ϵͳ......");
		System.out.println("����������ת����......");
		System.out.println("�����Ѿ������򿪣������");
	}
}
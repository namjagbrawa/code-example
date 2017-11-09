package com.bingo.code.example.design.memento.rewrite;

import java.io.*;
/**
 * �������ļ��б���ģ����������A�Ķ���ı���¼����
 */
public class FlowAMementoFileCareTaker {

	/**
	 * ���汸��¼����
	 * @param memento ������ı���¼����
	 */
	public void saveMemento(FlowAMockMemento memento){
		//д���ļ���
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream("FlowAMemento")
					)
			);
			out.writeObject(memento);
		}catch(Exception err){
			err.printStackTrace();
		}finally{
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * ��ȡ������ı���¼����
	 * @return ������ı���¼����
	 */
	public FlowAMockMemento retriveMemento(){
		FlowAMockMemento memento = null;
		//���ļ��л�ȡ����¼����
		ObjectInputStream in = null;
		try{
			in = new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream("FlowAMemento")
					)
			);
			memento = (FlowAMockMemento)in.readObject();
		}catch(Exception err){
			err.printStackTrace();
		}finally{
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return memento;
	}
}

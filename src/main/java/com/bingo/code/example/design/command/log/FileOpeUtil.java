package com.bingo.code.example.design.command.log;

import java.io.*;
import java.util.*;
/**
 * ��д�ļ��ĸ���������
 */
public class FileOpeUtil {
	/**
	 * ˽�л����췽���������ⲿ��ν�Ĵ�����ʵ��
	 * ��������಻��Ҫ������ʵ��
	 */
	private FileOpeUtil() {
	}
	/**
	 * ���ļ������ļ������ȡ�洢��List����
	 * @param pathName �ļ�·�����ļ���
	 * @return �洢��List����
	 */
	public static List readFile(String pathName) {
		List list = new ArrayList();
		ObjectInputStream oin = null;
		try {
			File f = new File(pathName);
			if(f.exists()){
				oin = new ObjectInputStream(
						new BufferedInputStream(new FileInputStream(f))
				);
				list = (List)oin.readObject();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(oin!=null){
					oin.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	/**
	 * д�ļ�����list����д�����ļ���ȥ
	 * @param pathName �ļ�·�����ļ���
	 * @param list Ҫд���ļ���list����
	 */
	public static void writeFile(String pathName,List list){
		File f = new File(pathName);
		ObjectOutputStream oout = null;
		try {
			oout = new ObjectOutputStream(
					new BufferedOutputStream(new FileOutputStream(f))
			);
			oout.writeObject(list);			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				oout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

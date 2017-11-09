package com.bingo.code.example.design.decorator.outputstream;

import java.io.*;

/**
 * ʵ�ּ򵥵ļ���
 */
public class EncryptOutputStream  extends OutputStream{
	//���б�װ�εĶ���
	private OutputStream os = null;
	public EncryptOutputStream(OutputStream os){
		this.os = os;
	}
	
	public void write(int a) throws IOException {
		//��ͳһ����ƶ���λ
		a = a+2;
		//97��Сд��a����ֵ
		if(a >= (97+26)){
			//������ڣ���ʾ�Ѿ���y����z�ˣ���ȥ26�ͻص�a����b��
			a = a-26;
		}
		this.os.write(a);
	}
}

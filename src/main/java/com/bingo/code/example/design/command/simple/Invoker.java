package com.bingo.code.example.design.command.simple;

public class Invoker {
	public void startPrint(Command cmd){	
		System.out.println("��Invoker�У��������ǰ");
		cmd.execute();
		System.out.println("����������");
	}
}
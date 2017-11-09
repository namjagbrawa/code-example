package com.bingo.code.example.design.state.testdb;
import java.util.*;
public class TestDB {
	public static Map map = new HashMap();
	static{
		Thread t = new Thread( new MemoryDB());
		t.start();
	}
}
class MemoryDB implements Runnable{
	
	public void run() {
		while(true){
			//һֱ������
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

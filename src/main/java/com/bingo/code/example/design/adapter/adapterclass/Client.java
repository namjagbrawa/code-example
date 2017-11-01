package com.bingo.code.example.design.adapter.adapterclass;
import java.util.*;
public class Client {
	public static void main(String[] args) {
		//׼����־���ݣ�Ҳ���ǲ��Ե�����
		LogModel lm1 = new LogModel();
		lm1.setLogId("001");
		lm1.setOperateUser("admin");
		lm1.setOperateTime("2010-03-02 10:08:18");
		lm1.setLogContent("test");
		
		List<LogModel> list = new ArrayList<LogModel>();
		list.add(lm1);

		
		LogDbOperateApi api = new ClassAdapter("");
		
		api.createLog(lm1);
		
		List<LogModel> allLog = api.getAllLog();
		System.out.println("allLog="+allLog);
	}
}

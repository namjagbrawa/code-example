package com.bingo.code.example.design.adapter.logfile;
import java.util.*;
public class Client {
	public static void main(String[] args) {
		LogModel lm1 = new LogModel();
		lm1.setLogId("001");
		lm1.setOperateUser("admin");
		lm1.setOperateTime("2010-03-02 10:08:18");
		lm1.setLogContent("这是一个测试");
		
		List<LogModel> list = new ArrayList<LogModel>();
		list.add(lm1);

		LogFileOperateApi api = new LogFileOperate("");
		api.writeLogFile(list);
		
		List<LogModel> readLog = api.readLogFile();
		System.out.println("readLog="+readLog);
	}
}

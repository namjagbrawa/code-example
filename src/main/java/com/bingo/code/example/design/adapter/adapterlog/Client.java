package com.bingo.code.example.design.adapter.adapterlog;
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

		LogFileOperateApi logFileApi = new LogFileOperate("");
		
		LogDbOperateApi api = new Adapter(logFileApi);
		
		api.createLog(lm1);
		
		List<LogModel> allLog = api.getAllLog();
		System.out.println("allLog="+allLog);
	}
}

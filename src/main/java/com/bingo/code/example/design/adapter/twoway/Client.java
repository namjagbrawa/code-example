package com.bingo.code.example.design.adapter.twoway;
import java.util.*;
public class Client {
	public static void main(String[] args) {
		//׼����־���ݣ�Ҳ���ǲ��Ե�����
		LogModel lm1 = new LogModel();
		lm1.setLogId("001");
		lm1.setOperateUser("admin");
		lm1.setOperateTime("2010-03-02 10:08:18");
		lm1.setLogContent("����һ������");
		
		List<LogModel> list = new ArrayList<LogModel>();
		list.add(lm1);

		LogFileOperateApi fileLogApi = new LogFileOperate("");
		LogDbOperateApi dbLogApi = new LogDbOperate();
		
		LogFileOperateApi fileLogApi2 = new TwoDirectAdapter(fileLogApi,dbLogApi);
		LogDbOperateApi dbLogApi2 = new TwoDirectAdapter(fileLogApi,dbLogApi); 
		
		dbLogApi2.createLog(lm1);
		List<LogModel> allLog = dbLogApi2.getAllLog();
		System.out.println("allLog="+allLog);
		
		fileLogApi2.writeLogFile(list);
		fileLogApi2.readLogFile();
	}
}

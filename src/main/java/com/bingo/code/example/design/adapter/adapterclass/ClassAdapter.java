package com.bingo.code.example.design.adapter.adapterclass;

import java.util.List;

public class ClassAdapter extends LogFileOperate implements LogDbOperateApi{
	
	public ClassAdapter(String logFilePathName) {
		super(logFilePathName);
	}

	public void createLog(LogModel lm) {
		List<LogModel> list = this.readLogFile();
		list.add(lm);
		this.writeLogFile(list);
	}

	public List<LogModel> getAllLog() {
		return this.readLogFile();
	}

	public void removeLog(LogModel lm) {
		List<LogModel> list = this.readLogFile();
		list.remove(lm);
		this.writeLogFile(list);
	}

	public void updateLog(LogModel lm) {
		List<LogModel> list = this.readLogFile();
		for(int i=0;i<list.size();i++){
			if(list.get(i).getLogId().equals(lm.getLogId())){
				list.set(i, lm);
				break;
			}
		}
		this.writeLogFile(list);
	}
}

package com.bingo.code.example.design.adapter.adapterlog;
import java.util.*;
public interface LogDbOperateApi {
	public void createLog(LogModel lm);
	public void updateLog(LogModel lm);
	public void removeLog(LogModel lm);
	public List<LogModel> getAllLog();
}

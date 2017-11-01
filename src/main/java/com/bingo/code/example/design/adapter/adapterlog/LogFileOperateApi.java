package com.bingo.code.example.design.adapter.adapterlog;

import java.util.List;
/**
 * ��־�ļ������ӿ�
 */
public interface LogFileOperateApi {
	public List<LogModel> readLogFile();
	public void writeLogFile(List<LogModel> list);
}

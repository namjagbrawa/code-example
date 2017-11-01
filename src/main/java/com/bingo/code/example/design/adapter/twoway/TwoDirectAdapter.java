package com.bingo.code.example.design.adapter.twoway;

import java.util.List;

public class TwoDirectAdapter implements LogDbOperateApi, LogFileOperateApi {
    private LogFileOperateApi fileLog;
    private LogDbOperateApi dbLog;

    public TwoDirectAdapter(LogFileOperateApi fileLog, LogDbOperateApi dbLog) {
        this.fileLog = fileLog;
        this.dbLog = dbLog;
    }

    public void createLog(LogModel lm) {
        List<LogModel> list = fileLog.readLogFile();
        list.add(lm);
        fileLog.writeLogFile(list);
    }

    public List<LogModel> getAllLog() {
        return fileLog.readLogFile();
    }

    public void removeLog(LogModel lm) {
        List<LogModel> list = fileLog.readLogFile();
        list.remove(lm);
        fileLog.writeLogFile(list);
    }

    public void updateLog(LogModel lm) {
        List<LogModel> list = fileLog.readLogFile();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLogId().equals(lm.getLogId())) {
                list.set(i, lm);
                break;
            }
        }
        fileLog.writeLogFile(list);
    }

    public List<LogModel> readLogFile() {
        return dbLog.getAllLog();
    }

    public void writeLogFile(List<LogModel> list) {
        for (LogModel lm : list) {
            dbLog.createLog(lm);
        }
    }
}

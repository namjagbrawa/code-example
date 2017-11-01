package com.bingo.code.example.design.adapter.adapterlog;

import java.util.List;

public class Adapter implements LogDbOperateApi {
    private LogFileOperateApi adaptee;

    public Adapter(LogFileOperateApi adaptee) {
        this.adaptee = adaptee;
    }

    public void createLog(LogModel lm) {
        List<LogModel> list = adaptee.readLogFile();
        list.add(lm);
        adaptee.writeLogFile(list);
    }

    public List<LogModel> getAllLog() {
        return adaptee.readLogFile();
    }

    public void removeLog(LogModel lm) {
        List<LogModel> list = adaptee.readLogFile();
        list.remove(lm);
        adaptee.writeLogFile(list);
    }

    public void updateLog(LogModel lm) {
        List<LogModel> list = adaptee.readLogFile();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLogId().equals(lm.getLogId())) {
                list.set(i, lm);
                break;
            }
        }
        adaptee.writeLogFile(list);
    }
}

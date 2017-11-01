package com.bingo.code.example.design.facade.rewrite;

public class DAO {
    public void generate() {
        ConfigModel cm = ConfigManager.getInstance().getConfigData();
        if (cm.isNeedGenDAO()) {
            System.out.println("正在生成数据层代码");
        }
    }
}
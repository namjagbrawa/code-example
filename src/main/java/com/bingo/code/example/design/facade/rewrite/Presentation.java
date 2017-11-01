package com.bingo.code.example.design.facade.rewrite;

public class Presentation {
    public void generate() {
        ConfigModel cm = ConfigManager.getInstance().getConfigData();
        if (cm.isNeedGenPresentation()) {
            System.out.println("正在生成表现层代码");
        }
    }
}
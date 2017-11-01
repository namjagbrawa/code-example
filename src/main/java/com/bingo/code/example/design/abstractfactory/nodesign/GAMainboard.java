package com.bingo.code.example.design.abstractfactory.nodesign;

/**
 * ���ε�����
 */
public class GAMainboard implements MainboardApi {
    private int cpuHoles = 0;

    public GAMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    public void installCPU() {
        System.out.println("now in GAMainboard,cpuHoles=" + cpuHoles);
    }
}

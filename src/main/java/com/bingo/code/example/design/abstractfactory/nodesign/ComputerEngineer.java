package com.bingo.code.example.design.abstractfactory.nodesign;

/**
 * װ������ʦ����
 */
public class ComputerEngineer {
    private CPUApi cpu = null;
    private MainboardApi mainboard = null;

    public void makeComputer(int cpuType, int mainboardType) {
        prepareHardwares(cpuType, mainboardType);
    }

    private void prepareHardwares(int cpuType, int mainboardType) {
        this.cpu = CPUFactory.createCPUApi(cpuType);
        this.mainboard = MainboardFactory.createMainboardApi(mainboardType);

        this.cpu.calculate();
        this.mainboard.installCPU();
    }
}

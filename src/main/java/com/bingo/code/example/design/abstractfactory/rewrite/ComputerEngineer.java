package com.bingo.code.example.design.abstractfactory.rewrite;

public class ComputerEngineer {
    private CPUApi cpu = null;
    private MainboardApi mainboard = null;

    public void makeComputer(AbstractFactory schema) {
        prepareHardwares(schema);


    }

    private void prepareHardwares(AbstractFactory schema) {
        this.cpu = schema.createCPUApi();
        this.mainboard = schema.createMainboardApi();

        this.cpu.calculate();
        this.mainboard.installCPU();
    }
}

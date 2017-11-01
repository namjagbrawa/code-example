package com.bingo.code.example.design.abstractfactory.rewrite;

public class Schema1 implements AbstractFactory{
	public CPUApi createCPUApi() {
		return new IntelCPU(1156);
	}
	public MainboardApi createMainboardApi() {
		return new GAMainboard(1156);
	}	
}
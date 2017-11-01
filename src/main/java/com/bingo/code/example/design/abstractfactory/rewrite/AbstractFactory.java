package com.bingo.code.example.design.abstractfactory.rewrite;
public interface AbstractFactory {
	public CPUApi createCPUApi();
	public MainboardApi createMainboardApi();
}
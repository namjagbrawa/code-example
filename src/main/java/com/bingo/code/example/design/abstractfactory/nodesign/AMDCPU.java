package com.bingo.code.example.design.abstractfactory.nodesign;
/**
 * AMD��CPUʵ��
 */
public class AMDCPU implements CPUApi{
	private int pins = 0;
	public AMDCPU(int pins){
		this.pins = pins;
	}
	public void calculate() {
		System.out.println("now in AMD CPU,pins="+pins);
	}
}

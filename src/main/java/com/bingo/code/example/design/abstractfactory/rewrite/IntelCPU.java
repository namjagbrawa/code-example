package com.bingo.code.example.design.abstractfactory.rewrite;
/**
 *Intel��CPUʵ��
 */
public class IntelCPU implements CPUApi{
	private int pins = 0;
	public IntelCPU(int pins){
		this.pins = pins;
	}
	
	public void calculate() {
		System.out.println("now in Intel CPU,pins="+pins);
	}
}

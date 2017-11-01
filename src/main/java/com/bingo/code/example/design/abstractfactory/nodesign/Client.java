package com.bingo.code.example.design.abstractfactory.nodesign;

public class Client {
	public static void main(String[] args) {
		ComputerEngineer engineer = new ComputerEngineer();
		engineer.makeComputer(1,2);
	}
}

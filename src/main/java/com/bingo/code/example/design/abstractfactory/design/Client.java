package com.bingo.code.example.design.abstractfactory.design;

public class Client {

	public static void main(String[] args) {
		AbstractFactory af = new ConcreteFactory1();
		af.createProductA();
		af.createProductB();
	}
}

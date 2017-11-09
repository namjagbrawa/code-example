package com.bingo.code.example.design.strategy.template;

public abstract class AbstractClass implements Strategy{

	public void algorithmInterface() {
		stepOneOpe();
		stepTwoOpe();
		stepThreeOpe();
	}
	private void stepThreeOpe(){}
	protected abstract void stepOneOpe();
	protected abstract void stepTwoOpe();
}

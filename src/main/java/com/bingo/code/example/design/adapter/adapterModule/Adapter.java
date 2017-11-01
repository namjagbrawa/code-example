package com.bingo.code.example.design.adapter.adapterModule;
public class Adapter implements Target {
	private Adaptee adaptee;
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	public void request() {
		adaptee.specificRequest();
	}
}


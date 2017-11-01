package com.bingo.code.example.design.builder.prototype.prototypemanager;
public interface Prototype {
	public Prototype clone();
	public String getName();
	public void setName(String name);
}
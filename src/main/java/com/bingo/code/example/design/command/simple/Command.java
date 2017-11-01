package com.bingo.code.example.design.command.simple;

public interface Command {
	public void execute();
	/**
	 * ����Ҫ���������
	 * @param s Ҫ���������
	 */
	public void setStr(String s);
}

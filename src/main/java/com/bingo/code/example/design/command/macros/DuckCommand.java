package com.bingo.code.example.design.command.macros;
/**
 * ������󣬱�����Ѽ
 */
public class DuckCommand implements Command{
	private CookApi cookApi = null;
	public void setCookApi(CookApi cookApi) {
		this.cookApi = cookApi;
	}
	
	public void execute() {
		this.cookApi.cook("������Ѽ");
	}
}

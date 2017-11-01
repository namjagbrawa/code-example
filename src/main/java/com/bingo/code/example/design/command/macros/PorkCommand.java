package com.bingo.code.example.design.command.macros;

/**
 * ��������������
 */
public class PorkCommand implements Command {
	private CookApi cookApi = null;

	public void setCookApi(CookApi cookApi) {
		this.cookApi = cookApi;
	}

	
	public void execute() {
		this.cookApi.cook("�������");
	}
}
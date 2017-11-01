package com.bingo.code.example.design.facade.nofacade;

public class Client {
	public static void main(String[] args) {
		new Presentation().generate();
		new Business().generate();
		new DAO().generate();
	}
}
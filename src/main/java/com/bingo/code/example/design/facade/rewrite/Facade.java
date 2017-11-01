package com.bingo.code.example.design.facade.rewrite;
public class Facade {
	public void generate(){
		new Presentation().generate();
		new Business().generate();
		new DAO().generate();
	}
}

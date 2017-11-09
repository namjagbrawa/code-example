package com.bingo.code.example.design.memento.revoke;

public class SubstractCommand extends AbstractCommand{
	
	private int opeNum;
	public SubstractCommand(int opeNum){
		this.opeNum = opeNum;
	}
	public void execute() {
		this.operation.substract(opeNum);
	}
	
}

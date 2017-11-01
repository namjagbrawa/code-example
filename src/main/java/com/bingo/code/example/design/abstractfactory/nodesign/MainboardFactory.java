package com.bingo.code.example.design.abstractfactory.nodesign;
public class MainboardFactory {
	public static MainboardApi createMainboardApi(int type){
		MainboardApi mainboard = null;
		if(type==1){
			mainboard = new GAMainboard(1156);
		}else if(type==2){
			mainboard = new MSIMainboard(939);
		}
		return mainboard;
	}
}

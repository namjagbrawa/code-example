package com.bingo.code.example.design.state.instate;

public class Client {
	public static void main(String[] args) {
		VoteManager vm = new VoteManager();
		for(int i=0;i<10;i++){
			vm.vote("u1", "A");
		}
	}
}

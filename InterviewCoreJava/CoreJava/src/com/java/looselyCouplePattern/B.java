package com.java.looselyCouplePattern;

public class B implements BInterface {

	@Override
	public void withDraw() {
		System.out.println("B WithDraw...");
		this.checkBalance();
		
	}

	@Override
	public void deposit() {
		System.out.println("B Deposit");
		
	}
	
	public void checkBalance(){
		System.out.println("B Check balance...");
	}
	

}

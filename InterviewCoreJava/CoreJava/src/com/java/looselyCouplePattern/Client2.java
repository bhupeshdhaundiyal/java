package com.java.looselyCouplePattern;

import com.java.looselyCouplePattern.FactoryClass;
public class Client2 {

	public static void main(String[] args) {
		BInterface b = FactoryClass.getObject();  //Dependency Injection
		b.deposit();
		b.withDraw();

	}

}

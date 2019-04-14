package com.java.basics1;

public class StaticInitMain {

	static{
		System.out.println("static block");
	}
	
	{
		System.out.println("inir blocks");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//StaticInitMain obj = new StaticInitMain();
		System.out.println("main block");
		
	}

}

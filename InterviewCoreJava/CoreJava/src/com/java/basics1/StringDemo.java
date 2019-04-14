package com.java.basics1;

public class StringDemo {

	public static void main(String[] args) {
		int b = 100;
		int c = 100;
		String z = new String("Hello");  //2 or 1 
		String a = "Hello";  // 1 or 0
		String x = "Hello";
		System.out.println(a.length());
		if(a==z.intern()){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		

	}

}

package com.java.oops;

public class Demo3 {

	public static void main(String[] args) {
		int a = 100;
		int b = 100;
		String x = new String("Hello"); // It is Internally char[]
		String y = new String("Hello");
		String z = x;
	/*	System.out.println(x.length());
		System.out.println(x.toUpperCase());*/
		//System s = new System();
		// Value Compare
		if(a==b){
			System.out.println("Same Int Values");
		}
		else
		{
			System.out.println("Not Same Int Values");
		}
		if(x==y){  // Here it is Comparing the References
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		// Now this time it compare the Values
		if(x.equals(y)){
			System.out.println("Same Values");
		}
		else{
			System.out.println("Not Same Values");
		}
		
	}

}

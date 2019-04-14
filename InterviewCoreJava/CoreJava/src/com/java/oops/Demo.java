package com.java.oops;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Args ::::"+args.toString());
		int a = Integer.parseInt(args[0]) ;
		int b = Integer.parseInt(args[1]) ;
		int c  =  a + b;
		System.out.println("Hello Java "+c);

	}

}

package com.java.oops;

public class StringPoolDemo {

	public static void main(String[] args) {
		String d = new String("bye"); // 2 or 1 
		String e = new String("bye"); // 1
		String a = "Hello"; // Object Creation would be 1 or 0
		// First Check in String Pool , the Object is there in a Pool or not
		// If In Pool , So not Create the New Object , Refer the Old One
		String b = "Hello".intern();
		String c = "Hello";  // String c = "Hello".intern();
		String x = new String("Hello").intern();
		if(a==b && a==c && a ==x){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("not same Ref");
		}
		if(d==e){
			System.out.println("Same");
		}
		else
		{
			System.out.println("not same");
		}

	}

}

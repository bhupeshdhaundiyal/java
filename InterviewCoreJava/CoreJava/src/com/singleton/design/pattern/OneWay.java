package com.singleton.design.pattern;

//Singleton : LAZY WAY ()when we call get instance then object will create 
//Problem : In the multi threaded environment 

class SingletonType1{
	
	private SingletonType1() {
	}

	private static SingletonType1 obj ;

	public static SingletonType1 getObj() {
	if (null == obj){
		System.out.println("::::: new instance created :::::");
		obj = new SingletonType1();
	}
		return obj;
	}


public void print(){
	System.out.println("Inside the print");
}
}

public class OneWay {

	public static void main(String[] args) {
		
		
		SingletonType1.getObj().print();
		SingletonType1.getObj().print();

		SingletonType1.getObj().print();

		SingletonType1.getObj().print();

	}
}

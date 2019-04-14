package com.singleton.design.pattern;

class SingletonType11{
	
	private SingletonType11() {
	}

	private static SingletonType11 obj ;

	public static synchronized SingletonType11 getObj() { //by making the synchronized keyword --now singleton
		                                                  //is thread safe. but costly process
	if (null == obj){
		System.out.println("::::: new instance created :::::");
		obj = new SingletonType11();
	}
		return obj;
	}
}

public class SecondWay {

	public static void main(String[] args) {

		
	}

}

/*package com.java.AbstractnInterface;


interface ITest {
	
	default public void method(){
		System.out.println(" Inside the default method 1");
	}
}

interface ITest2 {
	
	default public void method(){
		System.out.println(" Inside the default method 2");
	}
}


public class Interface8FeatureDefault implements ITest,ITest2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Interface8FeatureDefault().callMethod();
		
		

	}

	public void callMethod(){
		ITest2.super.method();
		ITest.super.method();
	}
}
*/
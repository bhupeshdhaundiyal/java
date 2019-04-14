package com.java.AbstractnInterface;


//with annonymous class we can override any methods  
//lambda expression ->  but we can use lambda with single method.
interface functionalInterface {
	public void onlyOneMethod();
}

public class FunctionalInterfaceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionalInterfaceClass obj = new FunctionalInterfaceClass();
		obj.method();
		
		functionalInterface obj1 = ()->{System.out.println("Insde the Functional Interface");};
		obj1.onlyOneMethod();
	}
	
	public void method (){
			System.out.println("Inside class method ");
	}

}

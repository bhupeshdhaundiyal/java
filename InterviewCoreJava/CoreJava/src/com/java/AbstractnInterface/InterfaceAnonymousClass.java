package com.java.AbstractnInterface;

//5 things :
/*
1. Annonymous class create 
2. Object of Annonymous class
3. Upcasting
4. Interface implement
5. Method Override
*/
//we can use the annonymous class where we have written 
// we will use the annonymous class like on the button  
//After compilation : OuterClass$1.class and so on ....
interface A {

	public void methodA();
}

public class InterfaceAnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a = new A() {
	
	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println(" Annonymous inner type method ");
	}
};
a.methodA();
		
	}

}

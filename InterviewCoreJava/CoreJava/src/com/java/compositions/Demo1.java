package com.java.compositions;

class W
{
	/*
	 * 
	 */
	@Deprecated
	void disp(){
		System.out.println("Inside Disp");
	}
}
interface Q
{
	/*default void show(){
		
	}*/
}
class Q1 implements Q
{
	
}

public class Demo1 {

	public static void main(String[] args) {
		Q obj = new Q1();
		/*
		W obj = new W();
		obj.disp();*/

	}

}

package com.java.compositions;

class Outer
{
	private int x=900; // Outer // Member
	Outer(){
		Inner obj = new Inner();
		obj.show();
	}
	void disp(){
		System.out.println("Outer Disp");
	}
	 class Inner
	{
		 int x = 200;  // Inner 
		void show(){
			int x = 300;  // Local
			int y = Outer.this.x + this.x + x;
			System.out.println("Inner Show "+y);
			Outer.this.disp();
		}
	}
}
public class InnerClassDemo {

	public static void main(String[] args) {
		Outer outer = new Outer(); //outer
		Outer.Inner inner1 = outer.new Inner(); //inner
		inner1.show();
		
		Outer.Inner inner = new Outer().new Inner();
		inner.show();
	}
}

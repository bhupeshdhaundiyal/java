package com.java.basics1;
/*final*/ class V                  //final class cannot be override
{
	final int X = 100;
	final void show(){              //final method can't overide
		
	}
}
class V1 extends V
{
	//@Override
	void show(int x){
		
	}
}
public class UseOfFinal {

	public static void main(String[] args) {
		//System.out.println();
		// TODO Auto-generated method stub

	}

}

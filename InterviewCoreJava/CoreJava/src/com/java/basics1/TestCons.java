package com.java.basics1;

import java.util.HashMap;

class X1
{
	X1(){
		
	}
X1(int x)
{
	this();
}
}
class Y1 extends X1{
}


public class TestCons {

	public static void main(String[] args) {
		Y1 obj = new Y1();
	}

}

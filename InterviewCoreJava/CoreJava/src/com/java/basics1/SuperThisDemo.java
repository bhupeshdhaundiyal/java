package com.java.basics1;

class K{
	int x = 999;
}
class I extends K
{
	int x=400;
}
class P extends I
{
	int x = 100;  // Instance
}
class Q extends P
{
	int x = 200;  // Instance (When Object is Created)
	Q(int x) // Local 	
	{
		int  z= ((K)this).x+((I)this).x+this.x+ super.x + x;
		System.out.println(z);
	}
}
public class SuperThisDemo {

	public static void main(String[] args) {
		Q obj = new Q(300);

	}

}

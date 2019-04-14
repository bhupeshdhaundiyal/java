package com.java.basics1;

class Overloading
{
	public int search(int exp){
		System.out.println("Exp");
		return 0;
	}
	protected float search(double salary){
		System.out.println("Salary");
		return 0.0f;
	}
	double search(int exp, String companyName){
		System.out.println("exp + company name");
		return 0.0;
	}
}
public class OverloadingDemo {

	public static void main(String[] args) {
		Overloading obj = new Overloading();
		obj.search(1000.20);

	}

}

package com.java.basics1;

class Parent
{
	int y ;
	Parent(){
		System.out.println("Parent class Default Cons");
	}
	Parent(int x){
		this();
		y = x;
		System.out.println("Parent Class Param Cons");
	}
}
class Child extends Parent
{
	int z = 200;
	
	Child(){
		super();
		//super(900);
		System.out.println("Child Class Default cons");
	}
	Child(int x){
		this(900,77);
		//super(200);  // Always First Line
		System.out.println("Child Class Param Cons "+(y+z));
		
	}
	Child(int x, int y){
		this();
	}
}
public class SuperAndThisUse {

	public static void main(String[] args) {
		Child obj = new Child(900);

	}

}

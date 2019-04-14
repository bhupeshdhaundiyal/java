package com.java.basics1;

// static and pricate metods are nt override 
class Base {
private static void display() {
System.out.println("Static or class method from Base");
}
public void print() {
System.out.println("Non-static or instance method from Base");
}
}
 
class Derived extends Base {
private static void display() {                       //data hiding not override
System.out.println("Static or class method from Derived");
}
public void print() {
System.out.println("Non-static or instance method from Derived");
}
}

public class DataHiding {
public static void main(String[] args) {
	Base obj= new Derived();
	//obj.display();           // not able to access
	obj.print();
}
}

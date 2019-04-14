package com.java.ImmutableConcept;

import java.util.ArrayList;
import java.util.List;

public class MutableVariablesInImmutable {

	private final List foo;
	
	public MutableVariablesInImmutable() {
		// TODO Auto-generated constructor stub
	    foo = new ArrayList<String>();
	    foo.add("TEST OBJECT1");    //addition
	    foo.add("TEST OBJECT2");
	}
	
	
	public ArrayList<String> getArrayList(){
		return (ArrayList<String>) new ArrayList<String>(foo);  //all the time creating new object and giving.
	//return (ArrayList<String>) ((ArrayList<String>) foo).clone(); //Another way by making the clone of the object 
	}
	public static void main(String[] args) {
	 MutableVariablesInImmutable obj = new MutableVariablesInImmutable();
	 //obj.foo.add("Another object");    /// again modification 
	 System.out.println(obj.foo);   

	 //obj.foo = new ArrayList<>();   // cant do ---> The final field MutableVariablesInImmutable.foo cannot be assigned
	 
	 
	 //because by making final we have only make constant the reference variable not the whole List;
	 //so you can modify the array list
	 //to avoid this we will send the copy of the array list not the exact array list in the getter method
	 //also we can do this by making clone of the object
	 
	 
	ArrayList<String > al = obj.getArrayList();
	al.add("1");
	al.add("2");
	
	obj.getArrayList().add("11111");
	obj.getArrayList().add("222222");
	
	System.out.println("Ater modification new array list ");
	
	System.out.println(al);
	 
	System.out.println("if again get for array list original array list will come not updated one ");
	
	System.out.println(obj.getArrayList());
	 
	 
	}
	
}

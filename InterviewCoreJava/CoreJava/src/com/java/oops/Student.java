package com.java.oops;

//Functionality
public class Student extends Object {
	private int rollno;  // It is a Member of a class
	private String name;  // Instance Variables
	private int duration;
	private String course; // Data must be protected from outside world
	private String phone;
	private String pinCode;
	private String city;
	
	public void takeInput(int rollno, String name ,int duration , String  course, String phone, String pinCode , String city){
	 if(rollno>0 && duration>0){
		this.rollno = rollno;
	 this.name = name;
	 this.duration = duration;
	 this.course = course;
	 this.phone = phone;
	 this.pinCode =pinCode;
	 this.city = city;
	 }
	 else
	 {
		 System.out.println("Invalid Data....");
	 }
	}

	
	// Data Must be access using methods
	
	// Instance Methods
	public void print(){
		// this--> It is a keyword , which hold the current object reference  
		// in main we call ram.print --> so ram store in this keyword
		// same thing for shyam  
		System.out.println("This is "+this);
		System.out.println("Rollno "+this.rollno);  // 6789.rollno
		System.out.println("Name "+name);
		System.out.println("Course "+course);
		System.out.println("Duration "+duration);
		System.out.println("Phone "+phone);
		System.out.println("PinCode "+pinCode);
	}
	
	/*@Override
	public int hashCode(){
		if(city.equals("Delhi")){
			return 10;
		}
		if(city.equals("Mumbai")){
			return 20;
		}
		else
		{
			return 30;
		}
		//return name.length();
	}*/

}

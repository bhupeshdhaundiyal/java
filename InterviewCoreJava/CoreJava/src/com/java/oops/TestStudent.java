package com.java.oops;

public class TestStudent {

	public static void main(String[] args) {
		int x;
		// ram local var
		Student ram = new Student();  
		// First Object Create in Heap and then Reference Assign 
		// ram is a Reference Variable
		// Object is a Instance of a class
		/*System.out.println("Rollno "+ram.rollno);  // 6789.rollno
		System.out.println("Name "+ram.name);
		System.out.println("Course "+ram.course);
		System.out.println("Duration "+ram.duration);
		System.out.println("Phone "+ram.phone);
		System.out.println("PinCode "+ram.pinCode);*/
		System.out.println("Ram "+ram);
		ram.print(); //DRY
		ram.takeInput(1001, "Ram", 3, "MCA", "2222", "3333", "Delhi");
/*		ram.rollno= -1001;
		ram.name="Ram";
		ram.course="MCA";
		ram.duration=-3;
		ram.phone="2222";
		ram.pinCode="110007";*/
		ram.print();  // DRY
		
		/*Student shyam = new Student(); 
		shyam.print();*/
		
/*		System.out.println("Rollno "+ram.rollno);  // 6789.rollno
		System.out.println("Name "+ram.name);
		System.out.println("Course "+ram.course);
		System.out.println("Duration "+ram.duration);
		System.out.println("Phone "+ram.phone);
		System.out.println("PinCode "+ram.pinCode);*/
		
		//System.out.println(ram.toString());
		//System.out.println(ram);  // When Ever we print an Object , it always call toString method of Object class

		/*Student ram1 = new Student();
		ram1.name="ram";
		Student tim = new Student();
		tim.name="tommy";
		Student kim = new Student();
		kim.name="kim";
		Student jim = new Student();
		jim.name="jim";
		System.out.println(ram1);
		System.out.println(tim);
		System.out.println(kim);
		System.out.println(jim);*/
		
	}

}

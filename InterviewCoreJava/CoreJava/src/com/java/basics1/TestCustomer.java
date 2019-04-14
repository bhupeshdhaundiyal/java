package com.java.basics1;
// Unit Testing
public class TestCustomer {

	public static void main(String[] args) {
		//Customer ram = new Customer();
		Customer ram = new Customer(1001,"Ram","Delhi");
		//ram = new Customer();
		ram.setEmail("ram@yahoo.com");
		ram.setEmail("ram@gmail.com");
		System.out.println(ram.getId());
		System.out.println(ram.getName());
		System.out.println(ram.getEmail());
		System.out.println(ram.getCompanyName());
		
		//ram.takeInput(-1001,"Ram","Delhi");
		//ram.print();
		/*ram.id=-1001;
		ram.name= "Ram";
		ram.address="Delhi";
		System.out.println(ram.id);
		System.out.println(ram.name);
		System.out.println(ram.address);*/
		/*
		Customer shyam =new Customer();
		shyam.takeInput(1002,"Shyam","Delhi");
		shyam.print();*/
		/*shyam.id=1002;
		shyam.name= "Shyam";
		shyam.address="Delhi";
		System.out.println(shyam.id);
		System.out.println(shyam.name);
		System.out.println(shyam.address);*/
		

	}

}

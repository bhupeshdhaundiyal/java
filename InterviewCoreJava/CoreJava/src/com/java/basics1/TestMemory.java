package com.java.basics1;
import java.util.ArrayList;


public class TestMemory {

	public static void main(String[] args) throws InterruptedException {
		long id = 1;
		ArrayList list =new ArrayList();
		System.out.println("Program Starts.....");
		while(true){
			Customer ram =new Customer(1001,"Ram"+id,"Delhi");
			Thread.sleep(50);
			id++;
			list.add(ram);
		}

	}

}

package com.learn.ExceptionHandling;

import java.util.Scanner;

//After line 19 when u use enter , directly reaches to the line 23 and then 26 without waiting for the 
//line 24 why ???

//Reason : scanner.nextInt() will only take integer value entered and not the \n
//(When we hit enter after entering the integer). So this \n is still in the buffer, 
//so when we use scanner.nextLine() 
//after sacn.nextInt() it takes or stores \n.That's why nextLine() was returning empty line.

public class ScannerDrawBack {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Age");
		int age = scanner.nextInt();
		System.out.println("Enter the Id ");
		int id = scanner.nextInt();
		//System.out.print("TEST"+scanner.nextLine()+"TEST"); 
		//After int we need to use extra nextLine() to accept string to consume \n becoz of enter. 
		System.out.println("Enter the Name");
		String name = scanner.nextLine();
		
		System.out.println("Name is ##"+name+"##");
		System.out.println("Age is "+age);

	}

}

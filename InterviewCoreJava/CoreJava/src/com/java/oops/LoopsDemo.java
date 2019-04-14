package com.java.oops;

public class LoopsDemo {

	public static void main(String[] args) {
		
		for(int i = 1; i<=10; i++){
			System.out.println("I is "+i);
		}
		int i= 1;
		while(i<=10){
			System.out.println("I is "+i);
			i++;
		}
		i = 1;
		do{
			System.out.println("I is "+i);
		}while(i<=10);
		int choice = 1;
		while(true){
			System.out.println("1. Burger");
			System.out.println("2. Soft Drink");
			System.out.println("3. Continue...");
			System.out.println("4. Exit");
			if(choice == 4){
				break;
			}
		}

	}

}

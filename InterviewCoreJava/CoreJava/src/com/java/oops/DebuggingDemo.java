package com.java.oops;

public class DebuggingDemo {

	public static void main(String[] args) {
		
		for(int i = 1; i<=3 ; i++){
			for(int j = 1 ; j<=i ; j++){
				if(i==j){
					continue;
				}
				else
				{
					System.out.println("I is "+i+" and j is "+j);
				}
			}
		}

	}

}

package com.java.oops;

public class IntegerPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer p= 10;
		Integer q = 10;
		
		if(p==q){
			System.out.println("Same reference");
		}
		else{
			System.out.println("Not same reference");
		}

		Integer a = new Integer(10);
		Integer b = new Integer(10);
		
		
		if(a==b.intValue()){
			System.out.println("Same reference");
		}
		else{
			System.out.println("Not same reference");
		}

		
		Integer c = new Integer(1000);
		Integer d = new Integer(1000);
		
		if(c==d){
			System.out.println("Same reference");
		}
		else{
			System.out.println("Not same reference");
		}

		
		
		
	}

}

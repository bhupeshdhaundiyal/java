package com.java.oops;

/*
A B C D E  
  A B C D  
    A B C  
      A B  
        A
*/public class PatternDemo {

	public static void main(String[] args) {

		int i ;
		int n = 5 ;

		for ( i= 0; i < n; i++) {
	    int value ='A';
		for (int j = 0; j < n; j++) {
		
			if(i>j){
				System.out.print("  ");
			}
			else{
			System.out.print((char)value++);
		    System.out.print(" ");
			}
	}
		System.out.println();
}
	}
}

package com.java.oops;

public class LabelLoop {

	public static void main(String[] args) {
		outer:
		for(int i = 1 ; i<=3;i++){
			for(int j = 1; j<=3 ; j++){
				if(i==j){
					break outer;
					//continue outer;
				}
				System.out.println("I is "+i+" And J is "+j);
			}
		}
	System.out.println("Main...");

	}

}

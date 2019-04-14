package com.java.basics1;

public class StringPerformance {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		System.out.println("Total Memory "+r.totalMemory());
		System.out.println("Free Memory "+r.freeMemory());
		System.out.println("Used Memory "+(r.totalMemory()-r.freeMemory()));
		long startTime = System.currentTimeMillis();
		String a = "Hello";
		for(long i = 1; i<=1000000; i++ ){
			// a = "Hello";
			a = new String("Hello");
		}
		System.out.println("Total Memory "+r.totalMemory());
		System.out.println("Free Memory "+r.freeMemory());
		System.out.println("Used Memory "+(r.totalMemory()-r.freeMemory()));
	
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);

	}

}

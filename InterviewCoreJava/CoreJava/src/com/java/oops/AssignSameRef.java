package com.java.oops;

public class AssignSameRef {

	public static void main(String[] args) {
		
		// 1 Make it Null
		// 2. Reassign the Reference
		// 3. Limit the Scope
		//String y = new String("Hello");
		//String x = "Hello this is a Sample Text";
		// Impact the Performance of the System 
		// Impact the Memory of the System
		long startTime = System.currentTimeMillis();
		Runtime r1 = Runtime.getRuntime(); // this class give heap information
		System.out.println(r1.totalMemory());
		System.out.println(r1.freeMemory());
		System.out.println(r1.totalMemory()-r1.freeMemory());
	    Runtime r2 = Runtime.getRuntime();
		
		if(r1==r2){
			System.out.println("Same Ref of Runtime Class");
		}
		else
		{
			System.out.println("not Same ref of Runtime Class");
		}
		String a= "Hello";
		for(long i = 1 ; i<=1000000; i++){
			//a = new String("Hello");
			a = "Hello";
		}
		System.out.println("*******************************************");
		System.out.println(r1.totalMemory());
		System.out.println(r1.freeMemory());
		System.out.println(r1.totalMemory()-r1.freeMemory());
		//System.gc(); // It just a Request for GC
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time Taken "+(endTime - startTime));

	}

}

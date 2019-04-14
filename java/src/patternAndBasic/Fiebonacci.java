package patternAndBasic;

import java.util.Scanner;



// fiebonacci series;;0 1 1 2 3 5 8 13....

public class Fiebonacci {

	public static void main(String[] args) {
		long a=0;
		long b=1;
//		
//		int sum =0;
//		System.out.println(a);
//		System.out.println(b);
//		for (int i = 0; i<=5-2; i++) {
//			sum=a+b; 
//		    System.out.println(sum);
//		    a=b;
//		    b=sum;  }
		    
			
			
			long num;
			@SuppressWarnings("resource")
			Scanner scanner=new Scanner(System.in);
			num=scanner.nextInt();
			System.out.println("fibo nacci series");
			System.out.println(a);
			System.out.println(b);
			for (int i =1; i <=num-2; i++) {
				long sum=a+b;
				System.out.println((sum));
				a=b;
				b=sum;
			
				
				}
			
			
			
		}
		
		
		
	}
	
	
	


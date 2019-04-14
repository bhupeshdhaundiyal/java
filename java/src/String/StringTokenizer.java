package String;

import java.util.Scanner;


public class StringTokenizer {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the data");
	String data =scan.nextLine();
	
	java.util.StringTokenizer st =new java.util.StringTokenizer(data);
	
	java.util.StringTokenizer st1 =new java.util.StringTokenizer(data,".");     
	// this dot represents that when the sentence is complete 
	
	System.out.println("total no. of words are"+st.countTokens()); 
	// it is counting the words...       
	
	System.out.println("total no. of senetences are"+st1.countTokens());  
	//total no. of sentences are count on the basis of .(fullstop)
   
	///System.out.println("words are "+st.hasMoreTokens());
    
	if(st.hasMoreTokens()){
		
		System.out.println("here");
		
		System.out.println(st.nextToken());
		
	}
	
	if(st1.hasMoreTokens()){
		System.out.println(st1.nextToken());
	}
	
} }

package String;

public class StringTest {
	
      StringTest() {
	System.out.println("!!!.....this is the contructor.....!!!");
	
	
	}
	
	
	StringTest(int a ){
		this();    // this () used for the cons call it must be the first statement in the cons call
	}
	
	public static void main(String[] args) {
		
		
		
		String s1 ="hey you" ;
       System.out.println("first tym val of s1 is "+s1);
		
       int s2=s1.hashCode();
       
       System.out.println("hashcoe value is "+s2);
		s1=s2+10+s1+"out there in the world";	      // if both the or a single operand are string 
		                                     // then +(operator) perform simple concat
		System.out.println("now val of s1 is "+s1);
		
		
		StringTest obj =new StringTest(10);
		
		
		
		
		
	}

}

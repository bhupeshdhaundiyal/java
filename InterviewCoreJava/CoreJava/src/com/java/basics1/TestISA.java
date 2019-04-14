package  com.java.basics1;

// Base Version

// Feature
/*
 * 1. Code Reuse
 * 2. Polymorphism - One thing several forms
 * 
 * Rule - 1 No Weaker Access Allowed in Child Overridden Method
 * Rule- 2 CoVariant Return Type (Java 5)
 */
class X
{
	int a,b;
}
class ChildX extends X{
	int c,d;
}

class Banking1{
	void deposit(){
		System.out.println("Banking Deposit....");
	}
	 X withDraw(){
		System.out.println("Banking WithDraw....");
		X obj = new X();
		return obj;
	}
}
class HDFC extends Banking1
{
	void roi(){
		System.out.println("HDFC 7% ROI ");
	}
	@Override
	 ChildX withDraw(){
		
		System.out.println("WithDraw with Pan Card....");
		ChildX obj = new ChildX();
		return obj;
		//super.withDraw();
	}
}
public class TestISA {

	public static void main(String[] args) {
		HDFC hdfc = new HDFC();
		hdfc.deposit();
		hdfc.withDraw();
		hdfc.roi();
		

	}

}

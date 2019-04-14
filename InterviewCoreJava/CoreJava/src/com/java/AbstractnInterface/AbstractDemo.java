package com.java.AbstractnInterface;

abstract class Loan
{
	void applyForLoan(){
		System.out.println("ApplyForLoan...");
	}
	abstract void emi();
	/* void emi(){
		 System.out.println("Loan EMI");
	 }*/
		
	
}
class HomeLoan extends Loan
{

	@Override
	void emi() {
		// TODO Auto-generated method stub
		
	}
	
}
class AutoLoan extends Loan
{

	@Override
	void emi() {
		// TODO Auto-generated method stub
		
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		HomeLoan fiveYear = new HomeLoan();
		fiveYear.emi();
		//fiveYear.homeloanEmi();
		AutoLoan threeYear = new AutoLoan();
		//Loan sixYear  = new Loan();

	}

}

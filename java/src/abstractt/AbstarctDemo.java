package abstractt;

public class AbstarctDemo {

	public static void main(String[] args) {
		
		HomeLoan fiveYear = new HomeLoan();
		fiveYear.emi();
		//fiveYear.homeloanEmi();
		AutoLoan threeYear = new AutoLoan();
		//Loan sixYear  = new Loan();
		Loan obj =new Loan() {
			
			@Override
			void emi() {
				// TODO Auto-generated method stub
				System.out.println("defining the emi by using the anonymous class...");
				
			}
		};
                                                                    // abstract class free to create obj
		obj.emi(); 
		//if method abstract mandatory to define in  child
		// abstract class may or may not have the abstract methods..
	}

}

abstract class Loan
{
	void applyForLoan(){                                         // not abstract method
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
	void emi(){      // mandatory to define the abstract method in child....
		
		System.out.println("HomeLoan EMI");
	}
}
class AutoLoan extends Loan
{

	@Override
	void emi() {
		// TODO Auto-generated method stub
		System.out.println("auto loan emi");
	}
	
}


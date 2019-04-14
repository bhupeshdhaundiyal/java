
package looselyCoupledapplication;


public class EnhanceB implements BInterface {

	@Override
	public void withDraw() {
		
		System.out.println("Faster WithDraw");
		this.checkBalance();
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Faster Deposit");
		
	}
	
	public void checkBalance(){
		System.out.println("Faster CheckBalance");
	}

}

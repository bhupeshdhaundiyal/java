package com.java.basics1;

class Banking
{
	public void withDraw(){
		if(accountCheck()){
			if(checkBalance()){
				if(checkNoOfTransaction()){
					if(!checkLock()){
						System.out.println("WithDraw Done...");
					}
					else
					{
						System.out.println("Account is Locked");
					}
				}
				else{
					System.out.println("Number of Transaction Exceed");
				}
				
				
			}
			else{
				System.out.println("Low Balance");
			}
		}
		else
		{
			System.out.println("Invalid Account");
		}
	}
	private boolean accountCheck(){
		return true;
	}
	private boolean checkBalance(){
		return true;
	}
	private boolean checkNoOfTransaction(){
		return true;
	}
	private boolean checkLock(){
		return false;
	}
}
class ATM
{
	void doTransaction(){
		Banking banking = new Banking();
		banking.withDraw();
	}
}
public class AbstractionDemo {

	public static void main(String[] args) {
		

	}

}

package com.java.basics1;

//100% Abstract Java 7
// abstract interface IPlayer
interface IPlayer // What to Do
{
	int MAX_RUN=100; //public static final int MAX_RUN = 100;
	int DEFAULT_RUN = 10;
	void run();  // public abstract void run();
	int increasePower();
	int attack();
}
interface SuperPower{
	void amazingPower();
	int attack();
}
// How to Do
class RedPlayer implements IPlayer, SuperPower{
	@Override
	public void run(){	
		System.out.println("RedPlayer Run Fast");
	}

	@Override
	public void amazingPower() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int increasePower() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int attack() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

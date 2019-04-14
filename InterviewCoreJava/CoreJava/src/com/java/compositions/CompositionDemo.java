package com.java.compositions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

class Employee
{
	int id;
	String name;
	LibaryCard lc ;
	Employee(int id , String name){
		this.id = id ;
		this.name = name;
		lc = new LibaryCard();
		System.out.println("Emp Class Param Cons Call");
	}
	Employee(int id , String name,LibaryCard lc){
		this.id = id ;
		this.name = name;
		this.lc = lc;
		System.out.println("Emp Class Param Cons Call");
	}
	@Override
	public void finalize(){
		/*File file = new File("D:\\4to6batch\\abcd.txt");
		PrintStream ps=null;
		try {
			ps = new PrintStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setOut(ps);*/
		System.out.println("Good Bye Employee");
	}
}
class LibaryCard
{
	 LibaryCard() {
		System.out.println("Library Card Cons Call");
	}
	 @Override
		public void finalize(){
			System.out.println("Good Bye Library Card");
		}
}
public class CompositionDemo {

	public static void main(String[] args) throws InterruptedException {
		LibaryCard lc = new LibaryCard();
		Employee ram =new Employee(1001, "Ram",lc);
		ram = null;
		//long i = 1;
		System.gc();
		/*String s = null;
		while(true){
			s = new String("Hello"+i);
			System.out.println("Loop is Going On");
			Thread.sleep(50);
		}*/
		for(int i = 1; i<=10; i++){
			System.out.println("Loop is "+i);
		}

	}

}

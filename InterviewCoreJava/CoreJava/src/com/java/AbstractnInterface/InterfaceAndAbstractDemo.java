package com.java.AbstractnInterface;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

interface E
{
	void show();
	void print();
}
abstract class EAdapter implements E{
	public void common(){
		System.out.println("Common Logic");
	}
	public void show(){
		
	}
	public void print(){
		
	}
}
class E1 extends EAdapter
{
	@Override
	public void show(){
		
	}
}
class E2 extends EAdapter
{
	
}
public class InterfaceAndAbstractDemo {

	public static void main(String[] args) {
		WindowListener l;
		WindowAdapter w;

	}

}

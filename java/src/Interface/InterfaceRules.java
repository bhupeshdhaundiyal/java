package Interface;


interface Sports
{
	void show();
}
interface Eco
{
	void print();
}
interface Hybrid extends Sports, Eco
{
	void disp();
}
abstract class Car implements Hybrid   // implements X,Y,Z
{
/*
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}*/

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}
	
}
class SUV extends Car
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

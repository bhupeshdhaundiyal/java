package inheritance;

public class Inhertance {
	
	
	int x=10;
	int y= 50;
	
	void display(){
		System.out.println("This is the method of display of parent");
	}
	
	void withdraw(){
		System.out.println("This is the withdraw method of parent");
	}
	



public class Child extends Inhertance{
	@Override                         // override depend on object creation so // occur at runtime called lazy runtime dynamic
	
	void display(){
		System.out.println("This is the method of display of child");
		super.display();   // for accessing the parent method from the child class
	}
	@Override
	void withdraw(){
		System.out.println("This is the withdraw method of child");
	}
	
	}
public static void main(String[] args) {
	
	Inhertance obj =new Inhertance();
	obj.display();
	Child ob=obj.new Child();
	ob.display();
	
	
	
	
	
}
}
package inheritance;

public class Superdemo {
	
	public Superdemo() {
		// TODO Auto-generated constructor stub
	
	System.out.println("parent cons");
	
	
	
	
	}
	
	public static class child extends Superdemo{    // when we create the parametrized cons then default cons kill...
		child(){
			super();  // by ddefault super der // it will initiliase the parent property // first line as it initialise the parent cons
			System.out.println("child class cons ");
		}
		
	
	
	public static void main(String[] args) {
		child obj =new child();
		
	}
	
	
	}
	
	

}

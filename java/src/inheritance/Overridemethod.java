package inheritance;

 class Overridemethod extends c {
	 public static void main(String[] args) {
			b b  = new b();
			b.doit();
		}
		
}

class a{
	
	/*private  a(){
		
	}                       // private cons restrict the inheritance 
	*/
	void doit(){
		System.out.println("this is the method in the A class");
	}
	
	
}
class b extends a{
	
	@Override
	void doit(){System.out.println("this is the method in the B class");
super.doit();
	}}


 class c extends b{
	@Override
	void doit(){
	System.out.println("this is the method in the C class");
	
	
	}
	
}

public class UpCastingandDownCasting {

	void aFamily(A obj){
		obj.print();
		obj.disp();
		if(obj instanceof B){
		B b = (B)obj;  //Downcasting(for specific features  )
		//B b = B(obj)
			((B)obj).output();    // this using downcast and method of B clas will execute.... 
		
		}
	}
		public static void main(String[] args) {
			// DRY 
			UpCastingandDownCasting o = new UpCastingandDownCasting();
			
			
			o.aFamily(new B());
			o.aFamily(new C());
			o.aFamily(new A());
			A obj = new B(); //Upcasting              // upcasting for access common features // b obj so overide method in d will run
			                                          // if not overrided then method of b will execute but that method also present in a.
	        System.out.println("from here...");
			obj.print();
			obj.disp();
		//	obj.output();
			/*B obj = new B();
			obj.print();
			obj.disp();
			
			C obj2 = new C();
			obj2.print();
			obj2.disp();*/
			

		}	
}                                                     //A>>b    //  A..c

class A
{
	void disp(){
		System.out.println("A Disp");
	}
	void print(){
		System.out.println("A Print");
	}
}
class B extends A
{
	@Override
	void print(){
		System.out.println("B Print");
	}
	void output(){
		System.out.println("B Output");
	}

}




class C extends A
{
	@Override
	void print(){
		System.out.println("C Print");
	}
}
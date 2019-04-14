package com.java.upcastingnDowncasting;
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
public class UpCastingDowncasting {
void aFamily(A obj){
	obj.print();
	obj.disp();
	if(obj instanceof B){
	//B b = (B)obj;  //Downcasting
	//B b = B(obj)
		((B)obj).output();
	
	}
}
	public static void main(String[] args) {
		// DRY 
		UpCastingDowncasting o = new UpCastingDowncasting();
		o.aFamily(new B());
		o.aFamily(new C());
		o.aFamily(new A());
		/*A obj = new B(); //Upcasting
*/		//obj.print();
		//obj.disp();
		//obj.output();
		/*B obj = new B();
		obj.print();
		obj.disp();
		
		C obj2 = new C();
		obj2.print();
		obj2.disp();*/
		

	}

}

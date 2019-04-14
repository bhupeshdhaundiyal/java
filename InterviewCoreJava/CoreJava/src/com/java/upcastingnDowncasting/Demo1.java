package com.java.upcastingnDowncasting;
class T
{
	T(){
		System.out.println("T Cons Call");
	}
	void T(){
		System.out.println("I am a Method");
	}
}
public class Demo1 {
	
	public static void main(){
		System.out.println("This is No Args Main");
	}
public static void main(int x){
	System.out.println("This is int Main");
	}
public static void main(double x){
	System.out.println("This is double Main");
}
public static void main(String x){
	System.out.println("This is double Main");
}
	public static void main(String[] args) {
		//System.out.println("This is Main");
		T obj = new T();
		obj.T();
		//main();

	}

}

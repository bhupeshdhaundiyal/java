package staticAbout;

public class Demo {
	
	public static void main() {
		System.out.println("bye");
		}
	
	void show(){
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		main();      // rule 1 static method of same class call directly by its name.
		
		Demo.main();       // also we may call by using the call name.staicmethod name.
		
		Demo a = new Demo();
		a.main();          // also call static method by using the object.
		
		
		
		
		
	}
	}
class SecondDemo{
	
	public static void main(String[] args) {
		System.out.println("how are you");
	}
}
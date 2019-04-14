package looselyCoupledapplication;
public class Client2 {

	public static void main(String[] args) {
		BInterface b = FactoryClass.getObject();  //Dependency Injection
		
		System.out.println(b);
		
		b.deposit();
		b.withDraw();

	}

}

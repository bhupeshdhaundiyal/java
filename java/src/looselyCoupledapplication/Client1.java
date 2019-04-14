package looselyCoupledapplication;
public class Client1 {

	public static void main(String[] args) {
		BInterface qq = new B();
		
		//FactoryClass f = new FactoryClass();
		//BInterface b = f.getObject();
		
		
		BInterface b = FactoryClass.getObject();
		b.deposit();
		b.withDraw();
		

	}

}

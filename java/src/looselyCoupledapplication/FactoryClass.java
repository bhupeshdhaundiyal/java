package looselyCoupledapplication;
import java.util.ResourceBundle;


public class FactoryClass {
	private FactoryClass(){}
	
	static BInterface obj = null;
	
	public static BInterface getObject(){
		/*BInterface b = new EnhanceB();
		return b;*/
		//return new B();
		
		
		ResourceBundle rb = ResourceBundle.getBundle("object");
		
		String myclassName = rb.getString("classname");
		
		System.out.println("name from bundle"+myclassName);
		
		try {
			//Object o = new B();   // upcatsing
			//Object o =Class.forName(myclassName).newInstance();
			
		
			
			obj = (BInterface)Class.forName(myclassName).newInstance();   // downcast
			
			
			System.out.println("here"+obj);
			
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

}

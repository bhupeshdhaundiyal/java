package String;

public class Stringc {

	String a="bhupesh dhaundiyal";
	String c="bhupesh dhaundiyal";                // both a nd c will point to same location...
	
	String z=new String("bhupesh dhaundiyal");
	String x=new String("bhupesh dhaundiyal");   // either two object created either 1 
	// provide direct access // takes ore memory dec performanece
	
	
	
	
	public static void main(String[] args) {
		Stringc  obj=new Stringc();
		
		System.out.println(obj.a);
		System.out.println(obj.c);
	}
	
	
	
	
	
}

package String;

public class immutable {

	String a ="bhupesh";
	
	public static void main(String[] args) {
		immutable obj=new immutable();
		
		System.out.println(obj.a="bye");
		obj.a="100";                                    // new memory created now and in that memory the value of a is 100
		                                                 // so finalyy the value of a is 100
		System.out.println(obj.a);
		
		
		
	}
	

	
}

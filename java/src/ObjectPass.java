
public class ObjectPass {

	public static void main(String[] args) {
		Employe obj =new Employe();
		represent obj1 =new represent(obj);
	}





}

class Employe{
	int a=10;
	String Name ="Bhupesh";
	String add="n,snajdjdsdoi";	
}
class represent{
	
	public represent(Employe obj) {
		// TODO Auto-generated constructor stub
		
		System.out.println(obj.a);
System.out.println(obj.Name);		
		System.out.println(obj.add);
	}
	
	
	
}

public class CopyCons {

	int roll=89;
	int marks=459;
	String name="jhjkh";
	
	public CopyCons(CopyCons obj) {
		
		roll=obj.roll;    // value will copy
		}
	@Override
	public String toString() {
		return "CopyCons [roll=" + roll + ", marks=" + marks + ", name=" + name
				+ "]";}

	public CopyCons() {
		
	}

	public static void main(String[] args) {
		
		CopyCons obj =new CopyCons();
		CopyCons obj1=new CopyCons(obj);   // this will assign the reference of the object to the object 1 also 
		
		
		System.out.println("obj is "+obj);
		System.out.println("obj1 is"+obj1);
		
		
		
	}
	
}

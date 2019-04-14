package serializable;

public class MethodOFSerializable implements MakingSerializable {    /// i have made the markerinterface of mine type

	
	
	
	
	// logic for making serilizable interface...
	
	
	boolean method(Object obj){
			if(obj instanceof MakingSerializable){
				System.out.println("it will write in the file");
				return true;
				
			}
			else{
				System.out.println("it will not write in the file ");
				return false;			}
		}
		

	public static void main(String[] args) {
		
		MethodOFSerializable obj =new MethodOFSerializable();
		boolean match=false;
		match=obj.method(obj);
		if(match==true){
			System.out.println("Serializable ");               // if class implements the seriliza ble then it print this
		}
		else {
			System.out.println("not seriliazable");                /// else print this 
		}
		
		
		
		
	}
	
	
	
	
}

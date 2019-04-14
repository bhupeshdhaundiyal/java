package inheritance;

public class ReturnObject {
	
	int roll;  // be default its value is null
	String name ="bhupesh dhaundiyal";
	static ReturnObject xyz;
	
	
	
	
      ReturnObject method(){
		
		ReturnObject obj =new ReturnObject();
		obj.name="bhupesh from method";
		System.out.println(obj);
		return obj;
		}
      
      @Override
      public String toString() {   // we overided the tostring method to print meaningfull data from object
		return (name +roll);
    	   };
    	   
     public static void main(String[] args) {
		
    	 
    	 ReturnObject obj =new ReturnObject();
    	 obj.name="new bhupesh";   // these data will not print as obj is taking all valuesbefore this...
    	 obj.roll=89;
    	xyz= obj.method();
    	System.out.println(xyz);
    	 
    	 
	}

}
	
	
	
	



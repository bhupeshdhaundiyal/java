import java.io.FileInputStream;


public class FunallyReturn {

	
	
	@SuppressWarnings("finally")
	int proveit(){
		try {
			
			throw new NoSuchFieldException();
			
			//System.out.println("in the try catch block");
		//System.exit(0);    // finally block will not execute as sytem.exit; 
			//return 1;    
			
		}
		catch(Exception e){
			System.out.println(e);
			return 65;    
		}
		
		finally{
		System.out.println("in the finally block");	
		//return 47;    
		// the return in the finally block will override the value of the return now a is 47;
		               
		           
		// also return in the finally bad idea if catch is not their then return statement also override the exception 
		}
		}

	
	public static void main(String[] args) {
		FunallyReturn obj=new FunallyReturn();
		int a =obj.proveit();     // before the rturn call the finally will execute...
	System.out.println("in the main the value of a is"+a);
	
	
	}
	
	
	
	
	
}

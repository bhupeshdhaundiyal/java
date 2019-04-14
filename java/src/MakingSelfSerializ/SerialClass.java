package MakingSelfSerializ;

public class SerialClass implements Serial  {
	
	public static void main(String[] args) {
		
		SerialClass obj=new SerialClass();
		if(obj instanceof Serial){
			System.out.println("yes it will pass");
			
		}
		else {
			System.out.println("not serial");
		}
	
	
	
	
	}
	
	
	

}

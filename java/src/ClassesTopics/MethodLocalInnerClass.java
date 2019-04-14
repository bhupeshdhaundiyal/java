package ClassesTopics;

public class MethodLocalInnerClass {

	
	void show(){
	
	 final int a=10;
	
		class local{
			
			int e =20;
			
			public void localmethod(){
				
				e++;
				
			//	a++;                   // we need tp make the a final as scope a is greater  
				                 // we are trying to acces the a which is in the stack from the heap
			
				
				System.out.println("value od a and e  is "+a+" " +e);
				
			}
			
			
		}
	
	
}
	
	
	
	
}

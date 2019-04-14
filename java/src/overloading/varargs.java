package overloading;

public class varargs {
	
	void add(int ...x){    // to declare the varargs  // it will take vary args
		int s=0;
		for(int j:x){   // enhanced for loop....take value from x one by one and den put the value in the j...
			
			s=s+j;		}
		System.out.println("sum is "+s);
		
	}
	
	public static void main(String[] args) {
		varargs obj =new varargs();
		obj.add(12);
		obj.add(45,45,45,45);

	}
	

}

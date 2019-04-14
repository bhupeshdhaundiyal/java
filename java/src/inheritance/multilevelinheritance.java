package inheritance;


class x {
	int var1;
}


class y extends x {
	
	int var2;
}

public class multilevelinheritance extends y {

	
	void compute(){
		
		int z = ((x)this).var1 + (((y)this).var2);
		
	}
	public static void main(String[] args) {
		
	
		
		
	}
	
	
	
}

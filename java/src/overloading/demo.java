package overloading;
                                        // called compile time polymorphism   // static keyword wrk // does not depend on obj creation 
                                         // depend on the arguments  only...
                                         // if vaue not match then go for type promotion >> wrapprr class(ato boxing)
public class demo {                       // >>if wrapper class not found den invoke var args
	

	
	int add(int x, int y){
		return x+y;
		
	}
	

	int add(int x, int y,int z){
		return x+y+z;
		
	}

	int add(int x, int y,int z, int q){
		return x+y+z+q;
		
	}
	
	public static void main(String[] args) {
		demo obj =new demo();
		System.out.println(obj.add(6, 12));
		System.out.println(obj.add(45, 45, 23));
		System.out.println(obj.add(4, 5, 6, 2));
		}}

package inheritance;

public class OverridingRules {
	public static void main(String[] args) {
		T obj = new T();
		obj.show(100);

	}   
	
}

// type promotion boolean 1>>char 2>> byte 1>>short 2 >>int 4>> long 8>> double 4>> float 8

//default int
//if int is missing - Type Promotion
//if type promotion is missing , search of same type Wrapper Class
//if same type wrapper not found , then invoke var-args

class T
{
	/*void show(int x){
		System.out.println("int");       // 1
	}*/
	
	/*void show(float x){
		System.out.println("float");   //2
	}
	/*void show(Integer x){
		System.out.println("Integer");    // 3
	}*/
	void show(int ...x){
		System.out.println("int ...");    // 4
	}
	void show(short x){
		System.out.println("short");
	}
	void show(byte x){
		System.out.println("byte");
	}
}


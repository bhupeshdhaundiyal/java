package  com.java.basics1;

class VarArgs
{
	void add(int ...x){
		int s = 0;
		/*for(int i = 0; i<x.length; i++){
			s  = s + x[i];
		}*/
		for(int j: x){
			s = s + j;
		}
		System.out.println("Add is "+s);
	}
	/*void add(int x , int y){
		System.out.println(x + y);
	}
	void add(int x , int y, int z){
		System.out.println(x + y + z);
	}*/
}
public class VarArgsDemo {

	public static void main(String[] args) {
		VarArgs obj = new VarArgs();
		obj.add();
		obj.add(10);
		obj.add(10,20);
		obj.add(10,30,90);
		obj.add(100,110,11,90,44,33);

	}

}

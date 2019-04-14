package com.java.basics1;
// default int
// if int is missing - Type Promotion
// if type promotion is missing , search of same type Wrapper Class
// if same type wrapper not found , then invoke var-args

//Boolean  Char byte short int long Float  Double 
 //1        2    1     2    4    8    4      8 
class T
{
	/*void show(int x){
		System.out.println("int");
	}*/
	/*void show(float x){
		System.out.println("float");
	}*/
	/*void show(Integer x){
		System.out.println("Integer");
	}*/
	void show(int ...x){
		System.out.println("int ...");
	}
	void show(short x){
		System.out.println("short");
	}
	void show(byte x){
		System.out.println("byte");
	}
}
public class OverLoadingRules {

	public static void main(String[] args) {
		T obj = new T();
		obj.show(100);

	}

}

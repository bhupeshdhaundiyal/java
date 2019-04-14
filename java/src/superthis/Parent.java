package superthis;

class Parent {

	
		int y ;
		Parent(){
			System.out.println("Parent class Default Cons");  //1
		}
		Parent(int x){
			this();
			y = x;
			System.out.println("Parent Class Param Cons");
		}
	
		public static void main(String[] args) {
			Child obj = new Child(900);

		}


}
	class Child extends Parent
	{
		int z = 200;
		
		Child(){
			super();
			//super(900);
			System.out.println("Child Class Default cons");   //2
		}
		Child(int x){
			this(900,77);
			//super(200);  // Always First Line
		//	System.out.println(y);
			System.out.println("Child Class Param Cons "+(y+z));  //3
			
		}
		Child(int x, int y){
			this();           // for the cons of the child...
		}
	}
 
	
	
	


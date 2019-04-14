package ClassesTopics;

public class OuterClass {
	
	class InnerClass{
		
		void printofInner(){
			
			System.out.println("Print method of the inner class");
		}
}

	static class InnerStaticClass{
		
        void printOfStaticInner(){
			
			System.out.println("Print method of the inner static class");
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		// inner static class doesnot need instantiattion of outer class
		
		OuterClass.InnerStaticClass staticObject= new OuterClass.InnerStaticClass();
		staticObject.printOfStaticInner();
		
		
		// non static inner needs instantiation of outer...
		
		OuterClass  outer = new OuterClass();
		
		OuterClass.InnerClass innerObject = outer.new InnerClass();
		innerObject.printofInner();
		
		
		
		
		
		
		
		
	}
	
	
	

}

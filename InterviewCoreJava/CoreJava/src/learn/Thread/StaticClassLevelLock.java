package learn.Thread;

//when we use static synch then lock taken on class level that means if any object of  that class will 
//execute then it will not give entry to any other thread of same class ---> as object is on class level

//For non static method -- it will execute parallely 



class Test12 extends Thread {

	@Override
	public void run(){
		
	testMethod();
	}
	
       /* synchronized void testMethod(){
		
		for (int i = 0; i < 10; i++) {
			System.out.println(" : INSIDE THE TEST12 : "+Thread.currentThread().getName());		
		}
*/
         static synchronized void testMethod(){
		
		        for (int i = 0; i < 10; i++) {
			         System.out.println(" : INSIDE THE TEST12 : "+Thread.currentThread().getName());		
	         	}
	}
}

public class StaticClassLevelLock {

	public static void main(String[] args) throws InterruptedException {

		Test12 obj1 = new Test12();
		Test12 obj2 = new Test12();
		Test12 obj3 = new Test12();
		Test12 obj4 = new Test12();
		Test12 obj5 = new Test12();
		
		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
		obj5.start();
		
		obj1.join();
		obj2.join();
		obj3.join();
		obj4.join();
		obj5.join();
		
	}

}

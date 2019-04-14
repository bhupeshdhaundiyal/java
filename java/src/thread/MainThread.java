package thread;

class Mythread11 extends Thread{
@Override
		public void run() {  // put the task in the run method which u want to complete through the  thread...
	
	Thread.currentThread().setName("thread 1");
	for (int i = 0; i <3; i++) {
		
		System.out.println(Thread.currentThread().getName());
		
	}
	
	
			
		}
	}



class Mythread12 extends Thread{
@Override
		public void run() {
	Thread.currentThread().setName("thread 2");
	for (int i = 0; i <3; i++) {
		
		System.out.println(Thread.currentThread().getName());
		
	}
	
	
			
		}
	}











public class MainThread {
public static void main(String[] args) {
	Thread.currentThread().setName("THREAD main");
	
	for(int i=0;i<3;i++){
		
		System.out.println(Thread.currentThread().getName());
		
		
		
		Mythread11 t1 =new Mythread11();
		Mythread12 t2 =new Mythread12();
		t1.start();
		t2.start();
		
		
		
		
	}
	
	
	
}
}

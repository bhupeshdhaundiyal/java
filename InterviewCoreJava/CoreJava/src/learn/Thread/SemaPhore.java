package learn.Thread;

import java.util.concurrent.Semaphore;

//Semaphore (work on the basis of Permit)  acquire and release two methods 
//Counting semaphore with one permit is known as binary semaphore 
//because it has only two state permit available or permit unavailable.
public class SemaPhore {
	       Semaphore obj = new Semaphore(1);
	public static void main(String[] args) {
		   SemaPhore test = new SemaPhore();
		
new Thread(new Runnable() {
	
	@Override
	public void run() {
		try {
			 test.testWork();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}).start();		
		
new Thread(new Runnable() {
	
	@Override
	public void run() {
		try {
			test.testWork();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}).start();		 

new Thread(new Runnable() {
	
	@Override
	public void run() {
		try {
			test.testWork();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}).start();		 



new Thread(new Runnable() {
	
	@Override
	public void run() {
		try {
			test.testWork();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}).start();		 


new Thread(new Runnable() {
	
	@Override
	public void run() {
		try {
			test.testWork();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}).start();		 

new Thread(new Runnable() {
	
	@Override
	public void run() {
		try {
			test.testWork();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}).start();		 


new Thread(new Runnable() {
	
	@Override
	public void run() {
		try {
			test.testWork();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}).start();		 



	} 

        private  void testWork() throws InterruptedException{
        obj.acquire();
		System.out.println("<<<<<Thread Name : "+Thread.currentThread().getName() + "Start>>>>" );
		Thread.sleep(500);
		System.out.println("<<<<<Thread Name : "+Thread.currentThread().getName() + "End>>>>" );

		obj.release();
	}

}







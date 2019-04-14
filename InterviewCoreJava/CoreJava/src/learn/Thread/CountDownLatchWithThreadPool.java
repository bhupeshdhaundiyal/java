package learn.Thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Count down latch in Thread Pool
///Count Down latch is not reusable where as cyclic barrier is reusable 
public class CountDownLatchWithThreadPool {

	public static void main(String[] args) {
		
     CountDownLatch ct = new CountDownLatch(10);

     ExecutorService ex = Executors.newFixedThreadPool(10);
     
     for (int i = 0; i < 10; i++) {
    	 ex.submit(new Process(ct));
		
	}
     try {
		ct.await();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		System.out.println("Completed");
	}
}

class Process implements Runnable{
	private CountDownLatch ct;
	Process(CountDownLatch ct){
		this.ct=ct;
		}
	@Override
	public void run(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ct.countDown();
	}
		
}
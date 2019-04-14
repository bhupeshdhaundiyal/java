package learn.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
//Thread Pool
class Processor implements Runnable{
	private int id ;
	public Processor(int id ) {
	this.id = id;
	}
	@Override
	public void run() {

		System.out.println("Starting id ::::"+id);
		try {
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Completed id ::::"+id);
	}
}

public class ThreadPool {
	public static void main(String[] args) {
		
		ExecutorService ex = Executors.newFixedThreadPool(2);
		
		for (int i = 0; i < 5; i++) {
			
			ex.submit(new Processor(i));
		}

		System.out.println("Before shutdown");
		ex.shutdown();
		System.out.println("After Shutdown");
		
		System.out.println("All tasks submitted");
		
		try {
			ex.awaitTermination(1, TimeUnit.DAYS);   //max time wait 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("All tasks completed");
	}
	
}

package learn.Thread;

import java.util.concurrent.CountDownLatch;

//Count Down Latch : Dev team A and dev team B are working and they have to pass the build to qa team 
//so  dev a and dev b are indeedent we will ake coint down latch with 2  count
//and in the task method (i.e run method ) we will decrement the count by one 
//and then when count zero further QA

public class LearnCountDownLatch {

	public static void main(String[] args) {
		
		CountDownLatch ct = new CountDownLatch(2);
		
		Developement d1 = new Developement(ct, "DEV A");
		Developement d2 = new Developement(ct, "DEV B");
		
		d1.start();
		d2.start();
		
		try {
			ct.await();    // it will check whether the count becomes zero or not if zero then further execute.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		QA qa = new QA();
		qa.start();
				
	}
}

class Developement extends Thread{
	
	private CountDownLatch ct;
	Developement(CountDownLatch ct ,String name ){
		super(name);
		this.ct =ct;
	}
	
	@Override
	public void run(){
    System.out.println("DEV Task Started : "+Thread.currentThread().getName());
    
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    System.out.println(" DEV Task Completed : "+Thread.currentThread().getName());	
    ct.countDown();  //After task completion count will be decremented by one 
	}
}

class QA extends Thread{
	
	@Override
         public void run(){
		System.out.println("QA TEAM STARTS");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("QA TEAM END ");
	}

	
	
}
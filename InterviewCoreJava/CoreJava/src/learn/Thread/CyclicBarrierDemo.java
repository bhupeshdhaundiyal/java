package learn.Thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;


//Cyclic Barrer : Different from count down latch --> can be reuse after breaking the barrier value
public class CyclicBarrierDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() +" started");

		CyclicBarrier barrier= new CyclicBarrier(4);
		
		Passengers p1 = new Passengers(1000, barrier, "P 1");
		Passengers p2 = new Passengers(2000, barrier, "P 2");
		Passengers p3 = new Passengers(3000, barrier, "P 3");
		Passengers p4 = new Passengers(4000, barrier, "P 4");
		
		Passengers p5 = new Passengers(1000, barrier, "P 5");
		Passengers p6 = new Passengers(2000, barrier, "P 6");
		Passengers p7 = new Passengers(3000, barrier, "P 7");
		Passengers p8 = new Passengers(4000, barrier, "P 8");
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		
		p5.start();
		p6.start();
		p7.start();
		p8.start();
		
		System.out.println(Thread.currentThread().getName() +" ends");
		
		
	}
	
}

class Passengers extends  Thread{
	
	private int duration;
	private CyclicBarrier barrier;
	
	Passengers(int duration, CyclicBarrier barrier, String passengerName)
	{
        super(passengerName);
		this.duration=duration;
		this.barrier=barrier;

	}
	
	@Override 
	public void run()
	{
	try {
		Thread.sleep(duration);
		System.out.println(Thread.currentThread().getName() +" Passenger is arrived ");
		int await = barrier.await();
		if(await==0)
		{
		System.out.println("Now await reaches to zero ");
		System.out.println("Cab service started ");
		}
	System.out.println(Thread.currentThread().getName() + " HERE ");	
	} catch (InterruptedException  | BrokenBarrierException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
}





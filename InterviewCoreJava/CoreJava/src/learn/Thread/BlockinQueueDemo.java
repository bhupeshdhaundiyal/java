package learn.Thread;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockinQueueDemo {

	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
	
	public static void main(String[] args) throws InterruptedException {
Thread  t1 = new Thread(new Runnable() {
	
	@Override
	public void run() {
		try {
			producer();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
});
		
Thread  t2 = new Thread(new Runnable() {
	
	@Override
	public void run() {
		try {
			consumer();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
});
		
	t1.start();
	t2.start();
	
	t1.join();
	t2.join();
	}
	
	private static void producer() throws InterruptedException{
		Random random = new Random();
		while (true){
			queue.put(random.nextInt(100));
			System.out.println("Producer Queue : "+queue +"; Size : "+queue.size());
		}
	}
    private static void consumer() throws InterruptedException{
    	Random random = new Random();
		while (true){
			Thread.sleep(100);
			//if(random.nextInt(10)==0){         //Whenever random number becomes equal to the zero then proceed
				Integer value = queue.take();    // take method of blocking queue wait until value lie in queue
				//As value lie then it will give you head value and then remove the head value. 
				System.out.println("Taken Value : "+value+"; Queue size is: "+queue.size());
			//}
		}
	}
}

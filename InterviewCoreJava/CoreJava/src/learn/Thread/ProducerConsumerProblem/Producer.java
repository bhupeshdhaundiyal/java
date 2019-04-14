package learn.Thread.ProducerConsumerProblem;
import java.util.Queue;
import java.util.Random;


/*// The standard idiom for calling the wait method in Java 
 * synchronized (sharedObject) 
 * {
 *  while (condition)
 *  {
 *   sharedObject.wait(); 
 *  // (Releases lock, and reacquires on wakeup)
 *   } 
 * ... // do action based upon condition e.g. take or put into queue }*/

public class Producer extends Thread {
	private Queue<Integer> queue;
	private int maxSize;
	
	public Producer(Queue<Integer> buffer, int maxSize, String name) {
		// TODO Auto-generated constructor stub
		super(name);
		this.queue=buffer;
		this.maxSize=maxSize;
	}

	@Override
	public void run(){
		
	while(true){
        synchronized (queue) {
	        while(queue.size()== maxSize){
		System.out.println("QUEUE IS FULL");
		try {
			queue.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        }
	        Random ran = new Random();
	        int random = ran.nextInt();
	        System.out.println("Adding queue :::"+random);
	        queue.add(random);
	        try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        queue.notifyAll();
        }
    }
	}
	}

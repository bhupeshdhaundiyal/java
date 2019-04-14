package learn.Thread.ProducerConsumerProblem;

import java.util.Queue;


/*// The standard idiom for calling the wait method in Java 
 * synchronized (sharedObject) 
 * {
 *  while (condition)
 *  {
 *   sharedObject.wait(); 
 *  // (Releases lock, and reacquires on wakeup)
 *   } 
 * ... // do action based upon condition e.g. take or put into queue }*/

public class Consumer extends Thread {
	private Queue queue;
	private int maxSize;
	
	
	public Consumer(Queue<Integer> buffer, int maxSize, String name) {
		// TODO Auto-generated constructor stub
		super(name);
		this.queue=buffer;
		this.maxSize=maxSize;
		
	}

	@Override
	public void run(){
		
	while(true){
        synchronized (queue) {
	        while(queue.isEmpty()){
		System.out.println("QUEUE IS EMPTY");
		try {
			queue.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        }
	        System.out.println("Consuming element from queue :::"+queue.remove());
	        queue.notifyAll();
        }
    }
	}
	}

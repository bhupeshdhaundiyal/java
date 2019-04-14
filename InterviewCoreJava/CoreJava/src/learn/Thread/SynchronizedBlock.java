package learn.Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//synch block takes 2 second while using synch method takes 4 second ??
// because sync block only locking for critical part where as synch method blocking for the whole method  
public class SynchronizedBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Worker().main();
	}
}
class Worker{
	private Random random = new Random();
	
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	
	private List<Integer> list1 = new ArrayList<Integer>();
	private List<Integer> list2 = new ArrayList<Integer>();
	
	public void stageone(){
	//public synchronized void stageone(){
		synchronized (lock1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list1.add(random.nextInt(100));
		}
			}
	public synchronized void stagetwo(){
	//public  void stagetwo(){
        synchronized (lock2){
        	try {
    			Thread.sleep(1);
    		} catch (InterruptedException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		list2.add(random.nextInt(100));
        }
	}
	public void process() {
		for (int i = 0; i < 1000; i++) {
			stageone();
			stagetwo();
		}
	}
	 public void main(){
		 System.out.println("Starting");
	    	long start = System.currentTimeMillis();
	    	//process();
	       Thread t1 = new Thread(new Runnable() { 
				
				@Override
				public void run() {
					process();
					
				}
			});t1.start();
			Thread t2 = new Thread(new Runnable() { 
					
					@Override
					public void run() {
						process();
					}
				});t2.start();
		    	try {
		    		t1.join();
		    		t2.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	long end = System.currentTimeMillis();
	     System.out.println(end-start);
	     System.out.println("List 1 : "+list1.size()+ "List 2 : "+list2.size());
	 }	
}
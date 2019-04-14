package learn.Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MineProducerConsumer {
	
	private static List<Integer> al = new ArrayList<Integer>(10);
    private static Random random = new Random();
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new Runnable() {
		
			@Override
			public void run() {

		synchronized (al) {
			while(true)
			{
				System.out.println(":: INSIDE PRODUCER ::");
				if(al.size()==10){
					System.out.println(":: SIZE FULL ::");
			        try {
						al.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
				}
                al.add(random.nextInt(100));			
                al.notify();
			}
		
			
		}	
			}
		});t1.start();
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
            synchronized (al) {
            	 while(true){
                	 System.out.println(":: INSIDE CONSUMER ::");
                 if(al.size()==0){
                    try {
    					al.wait();
    				} catch (InterruptedException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
                 }
                 al.remove(al.size()-1);
                 System.out.println(":: CONSUMED ANN NOTIFYING ::");
                 al.notify();
                 
                 }
			}
			
			
			}
		});t2.start();
		
		t1.join();
		t2.join();

		
		
		
	}
}

package learn.Thread;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Learn Reentrant Lock
//lock supports a maximum of 2147483647 recursive locks by
//* the same thread
public class ReEntrantLockWorking {

	public static void main(String[] args) throws InterruptedException {
    
		Runner r = new Runner();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {

				try {
					r.firstIncrement();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
        Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {

				try {
					r.secondIncrement();
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
        
        r.finalMethod();
		
	}
}



class Runner{
	
	int count =0;
	
	Lock lock = new ReentrantLock();
	Condition con = lock.newCondition();//Causes the current thread to wait until it is signalled or interrupted 
    
	public void increment() {
		
		for (int i = 0; i < 10000; i++) {
			count ++;
		}
	}
	
	public void firstIncrement() throws InterruptedException{
	
		System.out.println("Inside  the first increment");
		lock.lock();    //it will lock the further portion we will not do unlock 
		con.await();   // same as wait method of object class
		System.out.println("Again lie under the first increment");
		try {
			increment();             // inside try as interrupt	ion may occur so it will not unlock 	
		} 
		finally{
			lock.unlock();         // inside finally as whether exception occur or not it will execute 
		}
	}
    public void secondIncrement() throws InterruptedException{
       
    	Thread.sleep(1000); 
    	
    	System.out.println("Inisde Second Increment");
        lock.lock();    //it will lock the further portion we will not do unlock 
		System.out.println("Press Enter key to unlock the thread T - 1 ");
        Scanner s = new Scanner(System.in);
        s.nextLine();
        System.out.println("Enter key is pressed");
        con.signal();              //Wakes up waiting threads  , same as notify
        
		try {
			increment();             // inside try as interrupt	ion may occur so it will not unlock 	
		} 
		finally{
			lock.unlock();         // inside finally as whether exception occur or not it will execute 
	
		}
	}
	
    public void finalMethod(){
    	System.out.println("Final Count value "+count);
    }
    
}









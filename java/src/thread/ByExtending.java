package thread;
class jobss extends Thread{
	private String threadname;
	private Thread t;
	
	public jobss(String threadname) {
		// TODO Auto-generated constructor stub
	this.threadname=threadname;
	
	
	}
	
	@Override       // when i m not putting synchronizd the thread excecution is not synchronized 
	           //that is which and when it will execute is not in our control 
	    
	
	         // work of synchronizd is ????
	
	public void run(){                          
		
		
		System.out.println("task whic we want to prform by the threads");
		for (int i = 0; i < 5; i++) {
			System.out.println("thread is "+threadname+"printing number"+i);
			
		}}
	public void start(){
		System.out.println("it is the start method");
		Thread t =new Thread(this, threadname);
		t.start();
		
	}

	
	
	
}
public class ByExtending {
	
	public static void main(String[] args) {
		
		jobss job=new jobss("thread");
		synchronized (job) {
			job =new jobss("thread 1");
			job.start();
			job =new jobss("thread 2");
          job.start();
		}
		
	}}

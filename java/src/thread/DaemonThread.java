package thread;


//daemon thread - for service and background process 
//daemon thread are terminated by the JVM when there no any longer user thread is running
// Methods :1 setDaemon(true/false) -->   to specify thread is daemon thread
//          2 public boolean isDaemon()--> to determine thread is daemon or not ??



class daemon extends Thread{

	@Override
	public void run()
	{
		while(true){    /// condition of this while is true so thread must be infinite 
			//but as it is the daemon thread so it will stop executing after main thread is dead 
			
			
			System.out.println("daemon thread is runing");
			try{
				Thread.sleep(1000);
				
			}
			catch(Exception e){
				e.printStackTrace();
			}}}	
}

public class DaemonThread extends Thread {
	
	public static void main(String[] args) {
		System.out.println("main started");
		daemon t1 =new daemon();
		t1.setPriority(MAX_PRIORITY);    // syntax to assign priority..
		
		System.out.println("the priority of the thread is "+t1.getPriority());
		
		t1.setDaemon(true);     // now this thread is daemon thread
		
		if (t1.isDaemon()) {                                              // isDaemon()--> method to check 
			                                                              //wether thead is daemonor not
			System.out.println(" this thread is daemon...!!!");
			
		}
		
		
		
		
		//t1.start();   for normal thread it will execute the infinite times...
		try {
			Thread.sleep(1000);
			System.out.println("here...111");
			
		} catch (Exception e) {
		
		e.printStackTrace();
		
		}
		
	System.out.println("main ended");
}}

package thread;

// to be run right before the jvm shuts down(for closing the connection like log file, for clean the things etc )
// Runtime class in the java .lang package consist getRuntime() method --> class loaded in JVM return by the getRuntime();
// Runtime Class also have method addShutDownHook()--> execute the thread right before the JVM shuts down..


class A extends Thread{
	@Override
	public void run(){
		System.out.println("wait somebackground process is running...!!");
		try {Thread.sleep(2000);
		System.out.println("all resources ae closed..!!");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception caused..!!");
		}
	}
	
}
public class ShutDownThread {
public static void main(String[] args) {
	
	A t1 =new A();
	Runtime r =Runtime.getRuntime();
	r.addShutdownHook(t1);    // this addshutdown hook method start right 
	//before the JVM shutsdown and JVM shutDown when t1 is dead
	System.out.println("aplication starteddd");
	try{
		Thread.sleep(10000);
	}
	
	catch(Exception e){
		e.printStackTrace();
	}
System.out.println("application closed");


}
}

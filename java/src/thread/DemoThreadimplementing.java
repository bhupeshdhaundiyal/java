package thread;
class jobs implements Runnable{
private String threadname;
private Thread t;
public jobs(String threadname) {

	this.threadname=threadname;



}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("it is the task method "+threadname);

		}
//		System.out.println("it is the task method ");
	}
	
	
void start(){
	t=new Thread(this, threadname);
	System.out.println("method of the start in the thread");

System.out.println("calling to the tasks....by threads");
t.start();

}
	
	
	
	
	
}
public class DemoThreadimplementing {
private static jobs obj;

public static void main(String[] args) {
	System.out.println("it is the main method");
	obj =new jobs("thread 1");
obj.start();
	obj =new jobs("thread 2");
	
	obj.start();

}

}

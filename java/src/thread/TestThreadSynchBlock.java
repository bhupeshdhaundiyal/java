package thread;


class Testthread extends Thread{
	private String threadname;
	private Testthread obj;
	public Testthread(String threadname, Testthread tst){
		this.threadname=threadname;
		this.obj=tst;
		
		}

	void printcount(){
		for (int i = 5; i ==0; i--) {
			System.out.println("value of count is "+i);}}
	
	@Override
	public void run(){
		
		System.out.println("run method is start");
		synchronized (obj) {
			obj.printcount();
		}
	}
	}
public class TestThreadSynchBlock {
public static void main(String[] args) {
	Testthread tst1 =null;
			tst1=new Testthread("thread-1",tst1);
	Thread t =new Thread(tst1, "thread ");
	t.start();
	 tst1 =new Testthread("thread-1",tst1);
    t=new Thread(tst1, "thread");
	t.start();
	
	
	
	
	
}
}

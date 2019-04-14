package learn.Thread;

public class StaticSynchronization implements Runnable {

	int count = 0;
	
	public static void main(String[] args) throws InterruptedException {
		
		StaticSynchronization s1 = new StaticSynchronization();
		StaticSynchronization s2 = new StaticSynchronization();
		Thread t1 = new Thread(s1,"thread1");
		Thread t2 = new Thread(s2,"thread2");
		Thread t3 = new Thread(s1,"thread3");
		Thread t4 = new Thread(s2,"thread4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		
		
		
	}
	
	public static synchronized void increment(int i) throws InterruptedException {
		System.out.println("hello");
		Thread.sleep(100);
		System.out.println(Thread.currentThread().getName());
		System.out.println("hii");
		System.out.println("---------------");
	}

	@Override
	public void run() {
		//System.out.println(Thread.currentThread().getName());
		// TODO Auto-generated method stub
		for(int i=0;i<20;i++) {
			try {
				increment(i);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println(Thread.currentThread().getName()+":::"+i);
		}
		System.out.println("count is"+count);
	}
}


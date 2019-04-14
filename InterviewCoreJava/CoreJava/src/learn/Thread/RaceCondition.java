package learn.Thread;


public class RaceCondition {

	public static int count = 0;
	
	public synchronized static void increment(){count++;} 
	
	public static void main(String[] args) {

		System.out.println("Learn how threads work");
		
	Thread t1 =	new Thread(new Runnable() {
			@Override
			public void run() {
			for (int i = 0; i < 100000; i++) {
				//count++;
                increment();
			}
			}
		});t1.start();
		
	Thread t2 =	new Thread(new Runnable() {
			@Override
			public void run() {
			for (int i = 0; i < 100000; i++) {
				//count++;
                increment();

			}
			}
		});t2.start();
	
		try {
			t1.join();     //If  we will not use join then main thread will not wait and directly reaches to the 
			t2.join();     //syso

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(count);
	}

}




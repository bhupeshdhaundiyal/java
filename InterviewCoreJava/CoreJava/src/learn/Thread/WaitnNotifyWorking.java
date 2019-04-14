package learn.Thread;

//Learning for the wait and notify method working
class TestSynch{
	
	@Override
	public String toString() {
		return "TestSynch []";
	}

	public synchronized void testMethod() throws InterruptedException{
//public  void testMethod() throws InterruptedException{
	//synchronized (this) {
		
		System.out.println("THIS "+this.toString());
	for (int i = 0; i < 20; i++) {
			notify();	
			System.out.println("Value : "+i);
			wait();
			Thread.sleep(5);
			
		}
	}
	
//}
}
public class WaitnNotifyWorking {
	
	public static void main(String[] args) {

		TestSynch ts = new  TestSynch();

		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					ts.testMethod();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});t1.start();
Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					ts.testMethod();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});t2.start();
		
	}

}

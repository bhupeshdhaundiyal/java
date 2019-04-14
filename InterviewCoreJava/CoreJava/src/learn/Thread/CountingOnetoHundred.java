package learn.Thread;

//To print numbers 1 to 10;
public class CountingOnetoHundred {
	
	static int count = 1;
	 public static void printNumbers (){
		 for (int i = 0; i < 50; i++) {
			//increment();
			 synchronized (CountingOnetoHundred.class) {
				System.out.println(count++);
			}
		}
	 }
	 /*public synchronized static void increment(){
		 System.out.println(count++);
	 }*/
	public static void main(String[] args) {
	
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				printNumbers();
			}
		});
		t1.start();
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				printNumbers();
			}
		});
		t2.start();
	}
}

package learn.Thread;

//Dead Lock Scenario
public class DeadLock {

	public static void main(String[] args) {
		Acoount a1 = new Acoount();
		Acoount a2 = new Acoount();
		
	new Thread(new Runnable() {
		
		@Override
		public void run() {
			swapBalance(a1,a2);
			
		}
	});	
     new Thread(new Runnable() {
		
		@Override
		public void run() {
			swapBalance(a2,a1);
			
		}
	});	

	}
public static void swapBalance(Acoount a1,Acoount a2){
	synchronized (a1) {
        synchronized (a2) {
	System.out.println("::::DEAD LOCK:::");
        }		
	}
}
}

class Acoount{
	
}
package thread;
// MAX_PRIORITY =10  MIN_PRIORITY=1  NORM_PRIORITY=5   default priority is 5;

// setpriority()--> method is used to set priority  actual form:--> final void setPriority(int level)

//Priority level to decide the priority of their execution 
// getPriority()--> method to check priority
// if setpriority is not in this range then exception comes called 
// illegal argument exception...

class Aa extends Thread{
	@Override
	public void run(){
		System.out.println("it is the run method of the a");
		
	}
	
	
	
}
public class PriorityInThread {
	public static void main(String[] args) {
		Aa obj =new Aa();
		obj.setPriority(10);
		System.out.println(obj.getPriority());
		
		
		
		
	}
	

}

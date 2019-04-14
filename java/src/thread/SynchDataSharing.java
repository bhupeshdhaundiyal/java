package thread;
class shared {
	int x,y;
	synchronized int sum(int a, int b){    // by putting the word synchronized we make the working of thread...
		
		x=a;
		y=b;
		try {
			Thread.sleep(1000);
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		
		return(x+y);
	}
}
    
class client1 extends Thread{
	
	
	shared sh;
	public client1(shared st) {
	sh=st;
	start();
	}
	@Override
	public void run(){
		int total =sh.sum(100,200);
		System.out.println("sum of 100 and 200 is "+total);
	}}

class client2 extends Thread {
	
	shared sh;
public client2(shared st ) {
sh=st;
start();
}

public void run(){
	
	int total =sh.sum(300, 200);
	System.out.println("sum of 200 and 300 is "+total);
	
}}
public class SynchDataSharing {
	public static void main(String[] args) {
	
		shared sh =new shared();
		client1 c1 =new client1(sh);
		client2 c2 =new client2(sh);
		
		
		
		
	}

}

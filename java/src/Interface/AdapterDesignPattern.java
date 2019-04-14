package Interface;

interface IA{
	
	void IA1();
	void IA2();
	void IA5();
	void IA3();
	void IA4();
	
	
}

//if simply implement interface in the class then we need to implement each single method
abstract class  IAUsing implements IA{
	@Override
	public void IA1() {
		// TODO Auto-generated method stub
	System.out.println("definition of ai in  abstract method ");	
	}
	
	
	public  void IA2(){
		
	}
	public abstract void IA3();   
	//must need to make this methods public as by default in interface they are public 
	//so scope must always increase
	}
public class AdapterDesignPattern extends IAUsing{

	@Override
	public void IA5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void IA4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void IA3() {
		// TODO Auto-generated method stub
		
	}

	
	// we need to override the methods or implement those which are not define in the abstract class....
	
	
}

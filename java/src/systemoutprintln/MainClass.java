package systemoutprintln;
class printStream{
	void println(){
		System.out.println("in this way sop work...!!");
		
		
	}
}

class system{
	static printStream out =new printStream();
	
}



public class MainClass {
	public static void main(String[] args) {
		system.out.println();
		
	}

}

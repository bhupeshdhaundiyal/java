package inheritance;

public class UseOfFinal {

	public static void main(String[] args) {
		//System.out.println();
		// TODO Auto-generated method stub

	}

}

                                     // final class not do inheritance
/*final*/ class V
{
	final int X = 100;     // final variable become constt
	final void show(){     
		                      // final method not override..
		
	}
}
class V1 extends V
{
	//@Override
	void show(int x){
		
	}
}
 
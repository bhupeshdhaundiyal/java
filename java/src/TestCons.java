
public class TestCons {
	public static void main(String[] args) {
		Y1 obj = new Y1();

	}

}
class X1
{
	X1(){
		System.out.println("in x1");
	}
X1(int x)
{
	this();
	System.out.println("par x1");
}
}
class Y1 extends X1{
	
}


package superthis;

public class SuperthisDemo {

	public static void main(String[] args) {
		Q obj = new Q(300);

	}

	}


class K{                      //k>>i>>p>>q
	int x = 999;
}
class I extends K
{
	int x=400;
}
class P extends I
{
	int x = 100;  // Instance
}
class Q extends P
{
	int x = 200;  // Instance (When Object is Created)
	Q(int x) // Local 
	{
		
		System.out.println(((K)this).x);
		System.out.println(((I)this).x);
		System.out.println(((P)this).x);
		System.out.println(this.x);
		
		int  z= ((K)this).x+((I)this).x+this.x+ super.x + x;           //((k)this.x)  to refer the instance variable of k class
		System.out.println(z);
	}
}
package patternAndBasic;

public class FibonacciByRecurrence {
	
	int num =10;
	int a=0;
	int b=1;

	public int fiboRecurrence(){
	int sum=a+b;
	a=b;
	b=sum;
	return sum;
		
	}
public static void main(String[] args) {
	FibonacciByRecurrence obj =new FibonacciByRecurrence();

	
	System.out.println(obj.a);
	System.out.println(obj.b);
	for (int i = 0; i < obj.num-2; i++) {
		int temp=obj.fiboRecurrence();
		System.out.println(temp);
	}
	
	
}
}

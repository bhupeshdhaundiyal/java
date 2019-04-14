package Interface;



interface T
{
	void show();
}
// SAM
@FunctionalInterface
interface C
{
	
	int add(int x, int y);
}
//1st way to use interface
class T1 implements T
{
	@Override
	public void show(){
		System.out.println("T1 Show");
	}
}
interface K
{
	void show();
	
	
	
}
public class InterfaceUse {

	void disp(){                                           /// anonymous class...
		T obj = new T(){
			@Override
			public void show(){
				System.out.println("Anonymous Class Show");
			}
		};
		obj.show();
	}
	
	public static void main(String[] args) {
		InterfaceUse obj = new InterfaceUse();
		T obj11 = new T1();
		
		
		obj.disp();
		
		// 1. class anonymous
		// 2. interface implment
		// 3. method override
		// 4. object create anonymous class
		// 5. Upcasting
		if(100>20){
			T obj1 = new T(){          // upcasting 
				@Override
				public void show(){
					/*K obj1  = new K(){
						@Override
						public void show(){
							
						}
					};
			*/	
				
					// same as above...
                    // but only when functional interface or SAM (single abstract method)
					K obj1=()->{
				
				};
					System.out.println("Anonymous Class Show");
				}
			};
			//obj.show();
		}
		
		// wrk only for singe method....functional interface
		
		T obj2 =()->{
//			System.out.println("Lambda Show");
//			System.out.println("Lambda Show");
		System.out.println("Lambda Show");
			};
		obj2.show();
		
		//C obj3 = (a,b)-> a+ b;
		//System.out.println(obj3.add(100,200));
		

	}

}


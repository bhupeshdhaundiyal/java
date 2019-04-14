package GenericClassDemo;



class MakingGeneric <T>{

	T name;
	
	 MakingGeneric(T obj){
		name=obj;
		}
	
	
	T getNameOFClass(){
				
		return name;
	}


		
	
	
}



class x{

	@Override
	public String toString() {
		return "x";
	}
	
}

public class GenericClass {
	
	public String toString(){
	return "GenericClass";	
		
	}
	
public static void main(String[] args) {
	
MakingGeneric<Object> obj = new MakingGeneric<Object>(new GenericClass());

System.out.println("when pass the object of making generic class is  "+obj.getNameOFClass());


MakingGeneric<Object> objOfx = new MakingGeneric<Object>(new x());

System.out.println("when pass the object of x class is "+objOfx.getNameOFClass());


		

}}

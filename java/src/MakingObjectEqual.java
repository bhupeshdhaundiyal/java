
public class MakingObjectEqual {
	
	
	int a;
public static void main(String[] args) {


	MakingObjectEqual obj =new MakingObjectEqual();
	obj.a=10;
	MakingObjectEqual obj3;
	
	obj3=obj;    // assinment b/w the two objects making their refrence same 
	
	obj3.a=25;   
	//  change in the value of a by obj3 is also the change in the value of if we acces through a as refrence is same...
	
	System.out.println("value of obj "+obj);
	
	System.out.println("value of another obj "+obj3);	
	

System.out.println("the value of a is "+obj.a);   // both object now  have a =25;


}	
}

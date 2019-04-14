package objpass;

public class SelfOBJPass {
public static void main(String[] args) {
	

	person obj =new person();
	obj.home="dwarka";
	obj.uid=12345;
	
    toShow object =new toShow();
    object.objectrec(obj);



}	
}


class person{
	int uid;
	String home;
	
	}

class toShow{
	
	void objectrec(person obj){
		if(obj.home != null &&obj.home.equals("dwarka")&&obj.uid==12345);
		
		System.out.println("successfully obj pass");
	}
	
	
	
}
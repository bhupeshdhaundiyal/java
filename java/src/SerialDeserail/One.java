package SerialDeserail;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class One  {
	
	
	public static void main(String[] args)throws IOException, ClassNotFoundException 
	{
		Ram ram=new Ram(1002,1002,"bhupesh");
		FileOutputStream fo=new FileOutputStream("E:\\Serialization.txt");
		System.out.println("successfll write complete ");
		
		ObjectOutputStream ob=new ObjectOutputStream(fo);
		ob.writeObject(ram);
		
		ob.close();
		fo.close();
		 
		Ram.id++;      /// the value of the value is incremented but value of 
		                           //is must be the same as it is already written in the file  
		
		
		
		FileInputStream inp =new FileInputStream("E:\\Serialization.txt");
		ObjectInputStream oinp =new ObjectInputStream(inp);
			   Ram ramnew =(Ram)oinp.readObject();
			   System.out.println("object which readed is ");
			   System.out.println(ramnew);                          // here the value of the id will be updated not the store in the 
			                                       //file as static/transient not store in the file as they bind with the class not object
			
		
		
		
		//System.out.println(ram);
	}
	
}


class Ram  implements Serializable{
	
	static int id;
	private int salary;
	private String name;
	
    Ram(int id, int salary, String name) {
	this.id=id;
	this.salary=salary;
	this.name=name;
	}
	
    
    public String toString(){
    	return "id is" +id+"salary is "+salary+"name is "+name;
    }
    
	}
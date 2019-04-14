package serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employe implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int roll_no;
	String Name;
	
	Employe(int roll,String name){      //initialising the instance values of class 
		this.roll_no=roll;
		this.Name=name;
		
		
		}
	public String toString(){
		return "roll no is "+roll_no+"name is "+Name;
	}
	
public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

	
	// for writting the object in the file....
	
		Employe emp=new Employe(1001,"bhupesh");
		
		FileOutputStream fo =new FileOutputStream("E:\\test.dat");
		ObjectOutputStream os =new ObjectOutputStream(fo);
		
		System.out.println("writting the object");
		os.writeObject(emp);
		os.close();
		fo.close();
		
		
		
	
// for reading the object from the file ... 
	FileInputStream foo =new FileInputStream("E:\\test.dat");
		ObjectInputStream o =new ObjectInputStream(foo);		
		System.out.println("here 11111111111");
		Employe emp1=(Employe) o.readObject(); // type cast...
		
		System.out.println(emp1);
		o.close();
		fo.close();
		
//


}

}

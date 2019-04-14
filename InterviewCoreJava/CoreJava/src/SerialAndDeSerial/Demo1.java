package SerialAndDeSerial;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;   //Always define serial version id in case of serialization
	int id;
	private String name;
	private String temp;
	Employee(int id , String name){
		this.id  = id;
		this.name = name;
		System.out.println("Employee Param Cons Call");
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}
public class Demo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee ram = new Employee(1002, "Ram");
		ram.id++;
		FileOutputStream fo = new FileOutputStream("E:\\TestFolder\\Emp.dat");
		ObjectOutputStream os = new ObjectOutputStream(fo); 
		os.writeObject(ram);
		os.close();
		fo.close();
		System.out.println("Object Store in a File");
		FileInputStream fi = new FileInputStream("E:\\TestFolder\\Emp.dat");
		ObjectInputStream oi = new ObjectInputStream(fi);
		Employee emp = (Employee)oi.readObject();
		System.out.println(emp);
		oi.close();
		fi.close();

	}

}

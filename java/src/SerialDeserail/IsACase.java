package SerialDeserail;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Case -1 When Parent is Serializable   then both serial and desiral possible
// Case - 2 When Child is Serializable       only serialnot deserial as cons passing fo only child 
                                          //but super call the cons of parent so not cons passing of the parnt
class Parent implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int x;
	Parent(){
		x = 100;
		System.out.println("Parent Class Cons call");
	} 
}
class Child extends Parent// implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	transient int y ;
	transient int m=90;
	int a=77,b=20;
	D obj = new D();
	Child(){
		super();
		y = 200;
		System.out.println("Child Class Cons call");
	}
}
class D implements Serializable
{
	int e;
	float g;
	long h;
	double t;
}
// Case -3 Has a RelationShip
public class IsACase {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Child child =new Child();
		child.x++;
		child.y++;
		System.out.println(child.y++);
		System.out.println(child.x++);
		FileOutputStream fo = new FileOutputStream("E:\\4to6batch\\isademo.dat");
		ObjectOutputStream os = new ObjectOutputStream(fo);
		os.writeObject(child);
		os.close();
		fo.close();
		System.out.println("Store...");
		FileInputStream fi = new FileInputStream("E:\\4to6batch\\isademo.dat");
		ObjectInputStream oi = new ObjectInputStream(fi);
		Child childObj = (Child)oi.readObject();
		System.out.println(childObj.x+" "+childObj.y);       // it will print the value of the x is incremetned value 
		                                            // but for y it will not print anything as it not stotre in the file 
		                                             //so it does not having any value of y so by default put zero

	}

}

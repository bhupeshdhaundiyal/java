import java.util.ArrayList;
 // upcast and down cast for creating the dynamic array...... 

// we are making the static array into dynamic array...

public class DynamicArrayBYUPcstDwnCSt {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		Student ram = new Student(1001,"Ram");
		list.add(ram);
		Student shyam = new Student(1002,"Shyam");
		list.add(shyam);
		Student searchRam = new Student(1001,"Ram");
		list.add(searchRam);
		System.out.println(list);
	/*if(list.equals(1001)){
			System.out.println(" this found");
		}
		else {
			System.out.println("not found");
		}
		*/
		
		if(list.contains(searchRam)) 
// now the contains will check the value of the obj not reference thats why ans is found...
		{
		System.out.println("Found...");	
		}
		else
		{
			System.out.println("Not Found..");
		}
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(100);
		list1.add(200);
		list1.add(0,900);
		list1.add(0,700);  //value already present so not new value insert at 0
		
		list1.set(0, 1000);     // it will set the value at 0 either value already exist or not                
		if(list1.contains(200)){
			System.out.println("Found...");
		}
		else
		{
			System.out.println("Not Found...");
		}
		System.out.println(list1);
		System.out.println(list1.get(0));


	}

}


class Student extends Object                               // as we inherit the object class so all method comes...
{
	String name;
	int rollno;
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	Student(int rollno, String name){
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public boolean equals(Object o){                          //  we are defining the equal method of OBJECT class here
		Student student = (Student)o; // Downcasting
		if(this.rollno == student.rollno){
			System.out.println("here");
			return true;
			
		}
		else
		{
			return false;
		}
	}
}

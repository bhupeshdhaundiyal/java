package com.java.upcastingnDowncasting;
import java.util.ArrayList;

class Student extends Object
{
	int rollno;
	String name;
	Student(int rollno, String name){
		this.rollno = rollno;
		this.name = name;
	}
	
	public boolean equals(Object o){
		Student student = (Student)o; // Downcasting
		if(this.rollno == student.rollno){
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class UpCastingDownCastingExample {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		Student ram = new Student(1001,"Ram");
		list.add(ram);
		Student shyam = new Student(1002,"Shyam");
		list.add(shyam);
		Student searchRam = new Student(1001,"Ram");
		if(list.contains(searchRam))
		{
		System.out.println("Found...");	
		}
		else
		{
			System.out.println("Not Found..");
		}
		/*ArrayList list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(0,900);
		list.add(0,700);
		list.set(0, 1000);
		if(list.contains(200)){
			System.out.println("Found...");
		}
		else
		{
			System.out.println("Not Found...");
		}
		System.out.println(list);
		System.out.println(list.get(0));
*/		

	}

}

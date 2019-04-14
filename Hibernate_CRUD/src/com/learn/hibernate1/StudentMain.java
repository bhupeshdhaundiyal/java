package com.learn.hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentMain {

	SessionFactory sessionFactory;
	public StudentMain() {
		 sessionFactory = new Configuration().configure("hibernate.mycfg.xml").buildSessionFactory(); 
		//need to execute this at once as it is used to read the cfg file 
        //By default it takes the "hibernate.cfg.xml" but we can specify as "hibernate.mycf.xml"
	
	}
	
	private void addStudent(){
		Student obj =  new Student();
		obj.setId(5);
		obj.setName("TEST");
		obj.setDetails("TEST DETAILS");
		Session session = sessionFactory.openSession();	// open connection
		Transaction trans = session.beginTransaction();
		session.save(obj);	                            // insert record
		obj.setDetails(" UPDATED TEST DETAILS ");
		trans.commit();  	                            // saving transaction  //inserting data into DB
		session.close();                                // close connection
		System.out.println("Recorded Added Successfully....");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMain obj = new StudentMain();
	    obj.addStudent();	
	    obj.removeStudent();
	    obj.readStudent();
		
	}

	private void readStudent() {   //no need of transaction while reading the object

		System.out.println("Reading object with id  6 start");
		Session session = sessionFactory.openSession();
		Student student = session.get(Student.class, 7);
		System.out.println(student);
		session.clear();
		
	}

	private void removeStudent() {
       Session session = sessionFactory.openSession();
       Transaction transaction = session.beginTransaction();
     //(get method return the T type which u provide in  parameter as T.class)
       //1 way get eager 
       //2nd way load lazy
       //Student obj = session.get(Student.class, 8);       
       Student obj = session.load(Student.class, 5);
       session.remove(obj);
       transaction.commit();
       session.close();
       System.out.println("Rempved successfully ");
	}
}

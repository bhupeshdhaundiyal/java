package com.bhupesh.learn;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		Configuration config = new Configuration().configure();
		SessionFactory sessionFactory = config.buildSessionFactory();
		Employee employee = new Employee();
		employee.setId(100665);
		employee.setName("Mike 10056655");
		employee.setSalary(9090);
		employee.setAtt(true);
		employee.setCalc(10);
		employee.setDoj(new Date());
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(employee);
		employee.setSalary(employee.getSalary()+100);
		employee.setAtt(false);
		trans.commit();
		session.close();
		System.out.println("Record Added...");
    }
}

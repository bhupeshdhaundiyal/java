package com.learn.xml;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		
		System.out.println("END");
		
	}

}

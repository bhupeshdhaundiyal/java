package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		//Session session = sessionfactory.openSession();
		
		
		
		
	}

}

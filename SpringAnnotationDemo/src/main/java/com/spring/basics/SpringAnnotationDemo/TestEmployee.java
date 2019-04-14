package com.spring.basics.SpringAnnotationDemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee service = (Employee)context.getBean(Employee.class);
		System.out.println(service);
		/*String a = 1 +2 + 3 +"Ram"+90+90;
		System.out.println(a);*/
		//service.withDraw();
	}

}

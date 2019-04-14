package com.springCore.classs1.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		
		System.out.println("HERE 1111");
		Employee employee = (Employee)context.getBean("employeeBeanObject");
		System.out.println("HERE 2222");
		System.out.println(employee);
		employee.setName("RamUPDATED");
		System.out.println(employee);
		employee = (Employee)context.getBean("employeeBeanObject");
		System.out.println(employee);
		
	}
}

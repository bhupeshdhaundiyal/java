package com.springCore.classs1.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Caller {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");    //eager//support annotations
	
	 //@SuppressWarnings("deprecation")
	//BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));  //lazy //deprecated
	
	  System.out.println("XML READ.....");
	
	Iproducer producer = (Iproducer)context.getBean("producerObject");   // This step is called DI or IOC
	
	
	
	//Iproducer producer = (Iproducer)beanFactory.getBean("producerObject");
	int result = producer.add(100, 200);
	//producer = null;
	System.out.println("Result is "+result);
	//context = null;
	
	
	System.gc();
	for(int i = 1; i<=1000;i++){
		System.out.println("I is "+i);
	}
	producer = (Iproducer)context.getBean("producerObject");
	result = producer.add(90, 200);
	System.out.println("Result is "+result);
	
}


}
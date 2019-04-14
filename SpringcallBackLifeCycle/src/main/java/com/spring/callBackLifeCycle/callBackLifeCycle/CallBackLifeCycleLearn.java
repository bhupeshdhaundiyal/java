package com.spring.callBackLifeCycle.callBackLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CallBackLifeCycleLearn {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		CallBack lifeCycle = (CallBack)context.getBean("callbacklifecycle");
		System.out.println("Object Val : "+lifeCycle);
		System.gc();

		context=null;
		System.out.println("Complete");
		
		
		
		
	}
}

package com.springCore.classs1.SpringDemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Producer implements Iproducer ,InitializingBean,DisposableBean {
	public Producer(){
		System.out.println("Producer Cons Call");
	}
	int counter ;
	
	public void collectData(){
		counter = getDBCall();
	}
	public int getDBCall(){
		return 1000;
	}

	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Good Bye...");
	}
	protected void finalize(){
		System.out.println("END............"); 
		
	}
	public void afterPropertiesSet() throws Exception {    //After constructor Execute
		counter = getDBCall();
		System.out.println("Post "+counter);
		// TODO Auto-generated method stub
		
	}

}
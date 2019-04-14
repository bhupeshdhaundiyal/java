package com.spring.callBackLifeCycle.callBackLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CallBack implements DisposableBean,InitializingBean{

	int id;
	String name ;
	public int getId() {
		return id;
	}
	public CallBack() {
	System.out.println("DEfault contructor");
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "CallBack [id=" + id + ", name=" + name + "]";
	}
	
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("::::::::::Inside destroy method::::::::::");
		
	}
	public void afterPropertiesSet(){
	System.out.println("::::::::::::After properties set:::::::::::");
	}
	
	
}

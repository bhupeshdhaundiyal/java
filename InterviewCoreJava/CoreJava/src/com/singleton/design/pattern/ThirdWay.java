package com.singleton.design.pattern;
//double checked locking
class SingletonType111{
	
	private SingletonType111() {
	}

	private static SingletonType111 obj ;

	public static  SingletonType111 getObj() {    //instead of making whole method sync 
//as it increase extra overhead we will use the double check with synch block 
	
		
	if (null == obj){
		synchronized (SingletonType111.class) {
			if (null == obj){   //Again we are checking for null as when all threads come then only when thread
//will enter the synch block after creating instance i.e completely executing the synch block 
//all threads will get the chance so no another thread creates instance we are using double check.
		       System.out.println("::::: new instance created :::::");
		       obj = new SingletonType111();
	}
	}
	}
	return obj;
	}
	
	public void print(){
		System.out.println("::Hello print::");
	}
}
public class ThirdWay {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				SingletonType111.getObj().print();		
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				SingletonType111.getObj().print();		
			}
		}).start();

		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				SingletonType111.getObj().print();		
			}
		}).start();

		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				SingletonType111.getObj().print();		
			}
		}).start();

		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				SingletonType111.getObj().print();		
			}
		}).start();

		
		
		
		
		
	}
}

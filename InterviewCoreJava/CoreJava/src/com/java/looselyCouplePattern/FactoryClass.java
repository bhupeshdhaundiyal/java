package com.java.looselyCouplePattern;

import java.util.ResourceBundle;


public class FactoryClass {
	private FactoryClass(){}
	
	public static BInterface getObject(){
		/*BInterface b = new EnhanceB();
		return b;*/
		//return new B();
		BInterface obj = null;
		
		ResourceBundle rb = ResourceBundle.getBundle("object");
		
		String myclassName = rb.getString("classname");
		System.out.println("myclass name :::::"+myclassName);
		try {
			//Object o = new B();
			//Object o =Class.forName(myclassName).newInstance();
			obj = (BInterface)Class.forName("com.java.looselyCouplePattern."+myclassName).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

}

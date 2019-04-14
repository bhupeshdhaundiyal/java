package com.java.looselyCouplePattern;
import java.io.IOException;


public class Demo2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("Code Start");
		/*Runtime.getRuntime().exec("calc");
		Runtime.getRuntime().exec("notepad");*/
		
		Process proc = Runtime.getRuntime().exec( "cmd.exe /C runmyapp.bat" );
		proc.waitFor();
		//Process p = new ProcessBuilder("cmd", "/c", "C:\\Users\\arnav\\Desktop\\runmyapp.bat").start();
		/*System.out.println("Run....");
		Thread.sleep(3000);*/
		System.out.println("Code Ends");

	}

}

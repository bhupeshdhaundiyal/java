package com.java.oops;

public class IfElseSwitchCase {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		final int SUNDAY = 1;
		final int MONDAY = 2;
		final int TUESDAY = 3;
		int day = SUNDAY;
		
		// Switch only allowed int char byte (Before Java 7)
		// From Java 7 String is Allowed
		/*switch(day){
		default:
			System.out.println("Wrong Day");
			break;
		case SUNDAY :
			System.out.println("Funny Day");
			break;
		case MONDAY:
			System.out.println(" Boring Day ");
			break;
		case TUESDAY:
			System.out.println("Some How Like Monday");
		
		}*/
		
		// From Java 7 String is Allowed
		String days = "Sunday";
				switch(days){
				default:
					System.out.println("Wrong Day");
					break;
				case "Sunday" :  // case 'S':
					System.out.println("Funny Day");
					break;
				case "Monday":
					System.out.println(" Boring Day ");
					break;
				case "Tuesday":
					System.out.println("Some How Like Monday");
				
				}
		/*if(a=200)
		{
		System.out.println("True");
		}
		else
		{
		System.out.println("False");
		}*/
		/*if(true){
		//if(a>b){
			System.out.println("A is Greater");
		}
		else
		{
			System.out.println("B is Greater");
		}*/

	}

}

package com.avinash.java.switchcase;

public class Example1 {
	
	void processData(int dayIndex) {
		switch(dayIndex) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("invalid input");
		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 example1 = new Example1();
		example1.processData(12);
		

	}

}

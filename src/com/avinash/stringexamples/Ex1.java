package com.avinash.stringexamples;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex1 ex = new Ex1();
		
		 char maxChar =' ';
		 int maxCount = 0;
		 
		String str = "technocredits";
		
		while(str.length()>0) {
			int ol = str.length();
			char ch = str.charAt(0);
			//String temp = String.valueOf(ch);
			//str.replace(str.charAt(0)+"", "");
			str = str.replace(String.valueOf(ch), "");
			int nl = str.length();
			int count = ol - nl ;
			
			
			if (maxCount < count) {
				maxCount = count;
				maxChar = ch;
			}
			
		}
		System.out.println(maxChar +":"+maxCount);
	}
	

}

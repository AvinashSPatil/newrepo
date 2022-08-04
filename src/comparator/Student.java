package comparator;

import java.util.Comparator;

public class Student {
	int age;
	int rollNum;
	String name;
	int marks;
	
	public Student(int age, int rollNum, String name, int marks) {
		this.age = age;
		this.rollNum = rollNum;
		this.name = name;
		this.marks = marks;
	}
	
	public String toString() {
		return age +":"+rollNum+":"+name+":"+marks;
		
	}

	
}

package HashCodeinternal;

import java.util.HashSet;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student("Avinash", 111);
		Student std2 = new Student("Maulik", 112);
		Student std3 = new Student("Preethi", 113);
		Student std4 = new Student("Avinash", 111);
		Student std5 = new Student("Avinash", 114);
		System.out.println(std1.equals(std4));
		
		HashSet<Student> setofStudent = new HashSet<Student>();
		setofStudent.add(std1);
		setofStudent.add(std2);
		setofStudent.add(std3);
		setofStudent.add(std4);
		setofStudent.add(std5);
		
		System.out.println(setofStudent.size());
		

	}

}

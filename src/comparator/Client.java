package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(18,1,"Madhavi",149);
		Student s2 = new Student (16,2,"Shru",150);
		Student s3 = new Student(20,3,"Avi",148);
		
		ArrayList<Student> listofStudents = new ArrayList<Student>();
		listofStudents.add(s1);
		listofStudents.add(s2);
		listofStudents.add(s3);
		Collections.sort(listofStudents,new StudentAgeComparator());
		System.out.println(listofStudents);

	}

}

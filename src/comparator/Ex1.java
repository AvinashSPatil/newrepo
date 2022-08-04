package comparator;

import java.util.Collections;
import java.util.TreeSet;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Employee> empSet = new TreeSet<Employee>(Collections.reverseOrder());
		Employee emp1 = new Employee(101,"Avi",1000);
		Employee emp2 = new Employee(102,"Abhi",2000);
		Employee emp3 = new Employee(103,"Anand",3000);
		Employee emp4 = new Employee(104,"Vinayak",4000);
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		
		System.out.println(empSet);
	}

}

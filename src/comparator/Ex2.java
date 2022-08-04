package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empList = new ArrayList<Employee>();
		Employee emp1 = new Employee(101,"Vinayak",1000);
		Employee emp2 = new Employee(102,"Anand",2000);
		Employee emp3 = new Employee(103,"Abhi",3000);
		Employee emp4 = new Employee(104,"Avi",4000);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		
		Collections.sort(empList,Collections.reverseOrder());
		/*System.out.println(empList.get(0).empName);
		System.out.println(empList.get(1).empName);
		System.out.println(empList.get(2).empName);
		System.out.println(empList.get(3).empName);*/
		
		System.out.println(empList);

	}

}

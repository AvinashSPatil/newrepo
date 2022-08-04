package comparator;

public class Employee implements Comparable<Employee>{

	int empId;
	String empName;
	int sal;
	
	Employee(int empId,String empName,int sal){
		this.empId = empId;
		this.empName =empName;
		this.sal = sal;
	}

	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		return  this.sal-emp.sal;//+ve 0 -ve
	}
	
	public String toString() {
		return empId+":"+empName+":"+sal;
		
	}

}

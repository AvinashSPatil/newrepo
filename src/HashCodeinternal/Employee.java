package HashCodeinternal;

public class Employee {
	int empId;
	String empName;
	
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	public int hashCode() {
		return empId;
		
	}
	
	

}

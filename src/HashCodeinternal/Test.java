package HashCodeinternal;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(101, "Avinash");
		Employee emp2 = new Employee(102,"Patil");
		Employee emp3 = new Employee(101,"Avinash");
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		System.out.println(emp1.equals(emp2));
		
		
	}

}

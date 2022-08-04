package constructor;

public class Studen {
	
	{
		System.out.println("Patil");
	}
	
	{
		System.out.println("Avinash");
		
	}
	
	
	
	final int rollno;
	
	Studen(int rollno ){
		
		this.rollno = rollno;
	}
	
	void m1() {
		System.out.println(rollno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studen std = new Studen(101);
		std.m1();
		Studen std2 = new Studen(101);
		std2.m1();
		

	}
	

}

package interfacepractice;

public interface Manager {
	
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();

}

abstract class Employee1 implements Manager{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 method");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 method");
	}
}
abstract class Employee2 extends Employee1{

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3 method");
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("m4 method");
	}	
}

abstract class Employee3 extends Employee2{

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		System.out.println("m5 method");
		
	}
	
}

class Lead extends Employee3{
	
}




	


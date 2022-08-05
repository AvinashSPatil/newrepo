package constructor;

public class Parent {
	
	protected void m1() {
		System.out.println("parent class method12345");
	}

}


class Child extends Parent{
	
	protected void m1() {
		System.out.println("child class method");
	}
	
	void m2() {
		super.m1();
	}
	
}
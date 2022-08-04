package constructor;

public class Tests {
	
	int  x = 10;
	
	void m1() {
		this.x = 100;
	}
	
	void m2() {
		Tests test = new Tests();
		test.m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tests test = new Tests();
		test.m2();
		System.out.println(test.x);

	}

}

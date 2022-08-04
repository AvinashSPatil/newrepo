package classcast;

public class Client  {
	
	A m1() {
		return new B();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client();
		C temp = (C) client.m1();

	}

}

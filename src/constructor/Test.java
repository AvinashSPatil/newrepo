package constructor;

public class Test {
	
	Test(){
		System.out.println("GM");
	}
	
	Test(String input){
		if(input.length()>4) 
			System.out.println(input.charAt(0));
		System.out.println(input.charAt(5));	
	}
	
	Test(boolean flag){
		if(flag)
			System.out.println("1");
		System.out.println("2");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test test = new Test("Avinash");

	}

}

package constructor;

public class Example1 {
	{
		System.out.println("Hello");
		System.out.println("Techno");
	}
	
	Example1(){
		
		System.out.println("Hi");
		
	}
	
	Example1(int id){
		
		System.out.println(id);
		
	}
	
	Example1(int id ,String name ){
		
		System.out.println(id + " "+name);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 example1 = new Example1();
		example1 = new Example1(101);
		example1 = new Example1(101,"Avi");
		
		

	}

}

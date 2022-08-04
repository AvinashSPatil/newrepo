package constructor;
//Object class super()
public class P1 {

	{
		System.out.println("1");
	}
	
	P1(){
		//super(); compiler will put default in constructor while creating object 
		System.out.println("2");
	}
}

class C1 extends P1{
	
	{
		System.out.println("3");
	}
	
	C1(){
		//super(); compiler will put default in constructor while creating object 
		System.out.println("4");
	}
}


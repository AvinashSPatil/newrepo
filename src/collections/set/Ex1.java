package collections.set;

import java.util.HashSet;
import java.util.Set;

public class Ex1 {

	//Set will not maintain insertion order
	// its will not allow dupplicate 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> st1 = new HashSet<String>();
		st1.add("Avinash");
		st1.add("patil");
		st1.add("Vipul");
		st1.add(null);
		System.out.println(st1.add("Akash"));
		//System.out.println(st1.add("Akash"));
		System.out.println(st1.remove(null));
		System.out.println(st1);

	}

}

package collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hs = new LinkedHashSet<String>();
		hs.add("Avinash");
		hs.add("Patil");
		hs.add("Avi");
		hs.add("vipul");
		hs.add("Ankur");
		
		//System.out.println(hs);
		
		String output="";
		for(String name:hs) {
			output = name;

		}
		System.out.println(output);
	}

}

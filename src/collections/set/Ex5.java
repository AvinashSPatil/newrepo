package collections.set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"Mpatil","Akash","Amar","Avinash","Kumar","Avinash","Kumar"};
		
		Set<String> numSet = new LinkedHashSet<String>(Arrays.asList(arr));
		System.out.println(numSet);

	}

}

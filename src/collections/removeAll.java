package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class removeAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"Amrutha","Amol","Rahul","vivek","Amol","Amrutha","Ramesh","Ravi","Amrutha"};
		
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(arr));
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Amrutha");
		al1.add("Amol");
		
		al.removeAll(al1);
		System.out.println(al);
		

	}

}

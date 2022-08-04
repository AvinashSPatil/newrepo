package collections;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Avinash");
		listOfNames.add("Patil");
		listOfNames.add("Maulik");
		System.out.println(listOfNames);
		
		listOfNames.add(1, "Techno");
		System.out.println(listOfNames);
		
		System.out.println(listOfNames.remove(0));
		System.out.println(listOfNames);

	}

}

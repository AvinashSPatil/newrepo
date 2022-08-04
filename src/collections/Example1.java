package collections;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Avinash");
		listOfNames.add("Patil");
		listOfNames.add("Maulik");
		System.out.println(listOfNames);
		System.out.println(listOfNames.size());
		
		for(String name: listOfNames) {
			if(name.startsWith("M") && name.length()>5) {
				System.out.println(name);
				int index = listOfNames.indexOf(name);
				System.out.println(index);
				
			}
		}
		
		if(listOfNames.contains("Patil"))
			System.out.println(listOfNames.indexOf("Patil"));
		else
			System.out.println("Avinash is not present in the list");

	}

}

package collections;

import java.util.ArrayList;
import java.util.List;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listofNames = new ArrayList<String>();
		listofNames.add("Amruta");
		listofNames.add("Avi");
		listofNames.add("Amruta");
		
		while(listofNames.contains("Amruta")) {
			listofNames.remove("Amruta");
			
		}
		System.out.println(listofNames);
		
	}

}

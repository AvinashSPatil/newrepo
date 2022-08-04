package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class EampleComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list  = new ArrayList<>();
		
		list.add("Avi");
		list.add("Abhi");
		list.add("Ravi");
		list.add("Prakalp");
		
		Collections.sort(list);
		System.out.println(list);
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(13);
		list1.add(3);
		Collections.sort(list1);
		System.out.println(list1);

	}

}

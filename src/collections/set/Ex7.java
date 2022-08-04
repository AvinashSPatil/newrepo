package collections.set;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Avi");
		list.add("Shyam");
		list.add("Ankur");
		list.add("Margi");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			if(name.startsWith("S")&&name.length()>=5) {
				itr.remove();
			}
		}
		System.out.println(list);
	}

}

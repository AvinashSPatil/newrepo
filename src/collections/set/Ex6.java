package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.add("Avinash");
		hs.add("Rahul");
		hs.add("Margi");
		hs.add("Anushkha");
		hs.add("Martin");
		hs.add("George");
		hs.add("George1");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			if(itr.next() != null)
				System.out.println(itr.next());
		}
		
	}

}

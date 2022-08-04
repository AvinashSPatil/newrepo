package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<>();
		map.put(101, "Avi");
		map.put(102, "Patil");
		map.put(103, "Sush");
		map.put(104, "Mohini");
		map.put(105, "Mark");
		
		System.out.println(map);
		Set<Integer> keyset = map.keySet();
		Iterator<Integer>  itr = keyset.iterator();
		while(itr.hasNext()) {
			Integer key = itr.next();
			System.out.println(key +":"+map.get(key));
		}
		

	}

}

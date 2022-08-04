package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("Avinash", 101);
		map.put("Sachin", 102);
		map.put(null, 103);
		map.put("Mohini", 104);

		System.out.println(map);

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println(entrySet);
		Iterator<Entry<String, Integer>> itr = entrySet.iterator();
		System.out.println(itr);

		while (itr.hasNext()) {
			Entry<String, Integer> entry = itr.next();
			String key = entry.getKey();
			// System.out.println(key.length());
			Integer value = entry.getValue();
			System.out.println(key + "-->" + value); 
		}
	}

}

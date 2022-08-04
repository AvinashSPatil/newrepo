package map;

import java.util.HashMap;
import java.util.Map;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(101, "Avi");
		map1.put(102, "Prakalp");
		map1.put(103, "Arsh");
		
		Map<Integer,String> map2 = new HashMap<Integer,String>();
		map2.put(104, "Sachin");
		map2.put(105, "Vinayak");
		map2.put(106, "Anand");
		
		map1.putAll(map2);
		System.out.println(map1);
		
	

	}

}

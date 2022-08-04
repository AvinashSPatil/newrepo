package map;

import java.util.HashMap;
import java.util.Map;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map1 = new HashMap<String,Integer>();
		map1.put( "Avi",101);
		map1.put("Prakalp",102);
		map1.put("Arsh",103);
		System.out.println(map1);
		/*Integer value = map1.replace("Avinash",101);
		System.out.println(value);*/
		
		boolean value = map1.replace("Prakalp", 102, 110);
		System.out.println(value);
		System.out.println(map1);
		

	}

}

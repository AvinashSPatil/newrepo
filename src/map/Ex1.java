package map;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character,Integer> map = new HashMap<>();
		String s="avinash";
		
		for(int i=0;i<s.length();i++) {
		char ch = s.charAt(i);
		if(map.containsKey(ch)) {
			int cnt = map.get(ch);
			map.put(ch, ++cnt);
		}else {
			map.put(ch, 1);
		}
			
		}
		System.out.println(map);
	}

}

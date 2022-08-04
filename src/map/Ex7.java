package map;

import java.util.HashMap;
import java.util.Set;

public class Ex7 {

	void testKnowledge(int[] input) {
		HashMap<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
		for(int num : input) {
			if(numberMap.containsKey(num)) {
				numberMap.put(num, numberMap.get(num)+1);
			}
			else {
				numberMap.put(num, 1);
			}
		}
			
			int temp1 =0; int temp2 = 0;
			Set<Integer> keys = numberMap.keySet();
			for(int key : keys) {
			if(numberMap.get(key)> temp2) {
				temp1 = key;
				temp2 = numberMap.get(key);
			}
			}
		
			System.out.println(temp1+":"+ temp2);
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 33, 10, 33, 33, 24, 23, 24, 23, 78, 85, 85, 86 };
		new Ex7().testKnowledge(num);

	}

}

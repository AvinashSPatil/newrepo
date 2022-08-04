package collections.set;

import java.util.ArrayList;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numList1 = new ArrayList<Integer>();
		numList1.add(12);
		numList1.add(23);
		numList1.add(44);
		
		ArrayList<Integer> numList2 = new ArrayList<Integer>();
		numList2.add(22);
		numList2.add(23);
		
		numList2.removeAll(numList1);
		numList1.addAll(numList2);
		System.out.println(numList1);
		System.out.println(numList1.size());
		
		ArrayList<Integer> numList3 = new ArrayList<Integer>(numList1);
	
		
		for(int data:numList2) {
			if(!numList3.contains(data)) {
				numList3.add(data);
				
			}
			System.out.println(numList3);
		}
	}

}

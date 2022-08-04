package collections;

import java.util.ArrayList;

public class Example4 {
//unique element 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(100);
		arr.add(101);
		arr.add(102);
		arr.add(100);
		arr.add(101);
		arr.add(100);
		
		for(int num : arr) {
			if(arr.indexOf(num) ==arr.lastIndexOf(num)) {
				System.out.println("Uniques:"+num);
			}
			
		}
		
		for(int index=0;index<arr.size();index++) {
			int num = arr.get(index);
			if(arr.indexOf(num) != arr.lastIndexOf(num)) {
				if(index == arr.indexOf(num)) {
					System.out.println("Duplicate num:"+num );
				}
				
			}
			
		}
		
	}

}

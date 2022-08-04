package collections;

import java.util.ArrayList;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int  x = 2;
		arr.add(x);
		arr.add(40);
		arr.add(120);
		arr.add(50);
		
	int data = 	arr.get(0);
	arr.remove(data);
	System.out.println(arr.remove(new Integer(40)));
		
		System.out.println(arr);

	}

}

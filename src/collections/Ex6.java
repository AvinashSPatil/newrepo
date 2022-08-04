package collections;

import java.util.ArrayList;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> arr = new ArrayList<Double>();
		arr.add(10.5);
		arr.add(25.6);
		arr.add(101.5);
		arr.add(120.5);
		System.out.println(arr);
		arr.set(1, 30.5);//set method can be used to replace the existing data from the list 
		
		System.out.println(arr);
		//System.out.println(temp);

	}

}

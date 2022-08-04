package collections.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] data = {44.0f,10.10f,10.34f,32.12f,44.0f,10.34f};
		
		Set<Float> numberSet = new HashSet<Float>();
		for(float num : data) {
			if(!numberSet.add(num)) {
				System.out.println("Duplicate num:"+num);
			}	
		}
		
	//	----------------------------
		ArrayList<Float> numList = new ArrayList<Float>();
		for(float num: data) {
			if(numList.contains(num)) {
				System.out.println("Duplicate num is:"+num);
			}
			else {
				numList.add(num);
			}
			
		}

	}

}

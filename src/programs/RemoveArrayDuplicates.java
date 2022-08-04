package programs;

import java.util.Arrays;

public class RemoveArrayDuplicates {
	
	
	void removeDuplicates(int[] arr) {
		int countIndex=0;
		int[] output= new int[arr.length-2];
		for(int index=0;index<arr.length;index++) {
			if(arr[index]!=14) {
				output[countIndex] = arr[index];
				countIndex++;
			}
		}
		System.out.println(Arrays.toString(output));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,12,14,15,16,18,20,14};
		RemoveArrayDuplicates removeArrayDuplicates = new RemoveArrayDuplicates();
		removeArrayDuplicates.removeDuplicates(arr);
		

	}

}

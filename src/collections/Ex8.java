package collections;

import java.util.ArrayList;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Character> arr = new ArrayList<Character>();
		arr.add('m');
		arr.add('p');
		arr.add('s');
		arr.add('s');
		arr.add('s');
		
		
		/*for(Character ch:arr) {
			if(ch=='s')
				arr.remove(ch);	
		}*/
		
		for(int index=0;index<arr.size();index++) {
			char ch = arr.get(index);
			if(ch=='s') {
				arr.remove(index);
				index--;
			}
		}
		System.out.println(arr);
	}

}

package map;

import java.util.HashMap;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		System.out.println(map.put(1, "Gaurav"));//null
		System.out.println(map.put(1, "Maulik"));//Gaurav
		System.out.println(map.get(1));//Maulik 
		System.out.println(map.size());// 1 because map cannot allow duplicate 
		
		

	}

}

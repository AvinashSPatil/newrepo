package collections;

import java.util.Arrays;
import java.util.List;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"Maulik","Techno"};
		List<String> list = Arrays.asList(arr);
		list.remove("Techno");
		System.out.println(list);

	}

}

package programs;

public class ReverseNum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123;
		int revNum=0;
		
		while(num>0) {
			int rem = num % 10;
			revNum  = revNum * 10 + rem;
			num = num / 10;
			
		}
		System.out.println(revNum);
		

	}

}

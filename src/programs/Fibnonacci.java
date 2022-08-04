package programs;

public class Fibnonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1+",");
		System.out.print(num2+",");
		
		for(int i = 0;i<=10;i++) {
			int sum = num1 + num2 ;
			System.out.print(sum+",");
			num1 = num2;
			num2 = sum;
			
		}

	}

}

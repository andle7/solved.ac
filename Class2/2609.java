import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		int min = 0;
		
		for(int i=1; i <= num1 && i <=num2; i++) {
			if(num1%i ==0 && num2%i == 0)
			{
				min = i;
			}
		}
		
		int max = (num1*num2)/min;
		
		System.out.println(min);
		System.out.println(max);
		
		
	}
}

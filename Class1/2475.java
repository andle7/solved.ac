import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N[] = new int[5];
		int result = 0;
		
		for(int i = 0; i < N.length; i++) {
			N[i] = in.nextInt();
			result += Math.pow(N[i],2);
		}
		
		
		result %= 10;
		
		
		System.out.println(result);
		
		
	}
}
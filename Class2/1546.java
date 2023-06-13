import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = 0;
		float let[][];
		int Max = 0;
		double result = 0.0;
		
		
		N = in.nextInt();
		
		let = new float[N][2];
		
		
		for (int i = 0; i < let.length; i++) {
			
			let[i][0] = in.nextInt();
			
		}
		
		for (int i = 0; i < let.length; i++) {
			
			if(let[i][0] > Max) {
				Max = (int) let[i][0];
			}
			
		}
				
		
		for (int i = 0; i < let.length; i++) {
			
			let[i][1] = (float)let[i][0]/Max *100;
			
			result += let[i][1];
		}
		
		result = (float)result/N;

		System.out.println(String.format("%.6f", result));
		
	}
}

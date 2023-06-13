import java.util.Scanner;

public class Main {
	
	static final int M = 1234567891;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N = 0;
		long sum = 0;
		long pow = 1;
		int ch = 0;
		String let = "";
		
		N = in.nextInt();
		
		let = in.next();
		
		for (int i = 0; i < let.length(); i++) {
				sum += (int)(let.charAt(i)-96) *pow % M;
				pow = pow * 31 % M;
		}
		
		long hash = sum % M;
		
		System.out.println(hash);
		
	}
}

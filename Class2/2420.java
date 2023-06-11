import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long N = 0;
		long M = 0;
		
		
		while (true) {
			N = in.nextLong();
			if(N >= -2000000000 && N <= 2000000000) {
				break;
			}
		}
		
		while (true) {
			M = in.nextLong();
			if(N >= -2000000000 && N <= 2000000000) {
				break;
			}
		}
		
		
		if(N > M) {
			System.out.println(N - M);
		}else {
			System.out.println(M - N);
		}
		
	}
}

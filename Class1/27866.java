import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String S = "";
		int N = 0;
		
		
		S = in.next();

		while(true) {
			N = in.nextInt();
			if(S.length()>= N) {
				break;
			}
		}
		
		System.out.println(S.charAt(N-1));
		
	}	
}
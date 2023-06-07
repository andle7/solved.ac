import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N[] = new int[26];
		String let = in.next().toUpperCase();
		
		for(int i = 0; i <let.length(); i++) {
			N[let.charAt(i) - 65]++;
		}
		
		int max = 0;
		char result = '?';
		for(int i = 0; i < N.length; i++) {
			if(N[i] > max) {
				max = N[i];
				result = (char) (i + 65);
			} else if(N[i] == max) {
				result = '?';
			}
		}
		System.out.println(result);
		
	}
}
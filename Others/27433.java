import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long n = 0;
		Long sub = (long) 1;
		int i = 1;
		
		while(true) {
			n = sc.nextLong();
			if(n >=0 && n<= 20) {
				break;
			}
		}
		
		
		while(true) {
			
			sub *= i;
			i++;
			if(i>n) {
				break;
			}
		}
		
		System.out.println(sub);

	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1 = 0;
		int n2 = 0;
		
		int res = 0;

		n1 = input(n1, sc);
		n2 = input(n2, sc);
		
		n1 = fac(n2, n1);
		
		n2 = fac(n2, n2);
		
		
		res = n1/n2;
		
		
		System.out.println(res);
		
		
	}

	public static int fac(int n, int n2) {
		int sub = 1;
	
		for(int i = 1; i <= n; i++) {

			sub *= n2;
			n2--;
			
			}
		
		return sub;

	}
	
	
	public static int input(int n,Scanner sc) {
		while (true) {
			n = sc.nextInt();
			if (n >= 0 && n <= 12) {
				break;
			}
		}
		
		return n;
	}
	
	

}
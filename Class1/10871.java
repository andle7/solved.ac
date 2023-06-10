import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = 0;
		int Number[];
		int X = 0;
		
		N = in.nextInt();
		X = in.nextInt();
		
		Number = new int[N];
		
		for(int i = 0; i < Number.length; i++) {
			Number[i] = in.nextInt();			
		}
		
		for (int i = 0; i < Number.length; i++) {
			if(Number[i] < X) {
				System.out.print(Number[i] + " ");
			}
		}

	}
}
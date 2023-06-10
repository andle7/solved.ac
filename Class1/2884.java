import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H = 0;
		int M = 0;
		int totalm = 0;
		int HP = 0;
		int MP = 0;
		
		
		H = in.nextInt();
		M = in.nextInt();
		
		in.close();
		
		totalm = H*60 + M;
		int updatedMinutes = (totalm - 45 + 24 * 60) % (24 * 60);
		
		
		HP = updatedMinutes / 60;
		MP = updatedMinutes % 60;
				
		 System.out.printf(HP +" "+ MP);
	}
}
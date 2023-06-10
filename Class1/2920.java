import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N[] = new int[8];
		int N2[] = new int[N.length];
		int N3[] = new int[N.length];
		int cnt_2 = 0;
		int cnt_3 = 0;
		
		for(int i = 0; i < N.length; i++) {
			N[i] = in.nextInt();
			N2[i] = i+1;
			N3[i] = N.length - i;
		}
		
		for(int i = 0; i < N.length; i++) {
			
				if(N[i] == N2[i]) {
					cnt_2++;
				}
				
				if(N[i] == N3[i]) {
					cnt_3++;
				}
				
		}
		
		if(cnt_2 == 8) {
			System.out.println("ascending");
		}else if(cnt_3 == 8) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}	
		
	}
}

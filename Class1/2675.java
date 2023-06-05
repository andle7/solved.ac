import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = "";
		int TN = 0;
		String T[][];
		String R = "";

		while (true) {
			System.out.println("T케이스:");
			TN = in.nextInt();
			if (TN >= 1 && TN <= 1000) {
				break;
			}

		}

		T = new String[TN][2];


		for (int i = 0; i < TN; i++) {
			System.out.println("R:");
			R = in.next();
			T[i][0] = R;
			
			System.out.println("문자열S:");
			S = in.next();
			T[i][1] = S;

			
			for(int j = 0; j <S.length(); j++) {
				for(int k = 0; k < Integer.parseInt(T[i][0]); k++) {
					System.out.print(T[i][1].charAt(j));
				}
			}
			System.out.println();
		}

	}
}
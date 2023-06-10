import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = 0;
		String let[][];
		int cnt = 0;
		
		T = in.nextInt();
		
		let = new String[T][2];
		
		for (int i = 0; i < let.length; i++) {
			let[i][0] = in.next();
			let[i][1] = "0";
		}
		
		for (int i = 0; i < T; i++) {
				cnt = 0;
			for(int j = 0; j < let[i][0].length(); j++) {
				if(let[i][0].charAt(j) == 'O') {
					cnt++;
					let[i][1] =Integer.toString(Integer.parseInt(let[i][1])+cnt);

				}
				else if(let[i][0].charAt(j) == 'X') {
					cnt = 0;
				}
			}
		}

		for (int i = 0; i < T; i++) {
			System.out.println(let[i][1]);
		}

	}
}

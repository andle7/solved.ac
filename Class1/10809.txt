import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String let = "";
		String let2[] = new String[27];

		let = in.next();

		
		for (int i = 0; i < let.length(); i++) {
			for (int k = 0; k < 26; k++) {
			
				if (let2[k] == null && (int) let.charAt(i) - 97 == k) {
					
					let2[k] = Integer.toString(i);

				} 
	
			}
			
		}
		

		for(int i = 0; i < 26; i++) {
			if(let2[i] == null)
				let2[i] = "-1";
			System.out.print(let2[i] + " ");
		}
		
	}
}
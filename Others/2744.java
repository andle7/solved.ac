import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String let = "";
		int replace = 0;
			
		let = in.next();
	
		for (int i = 0; i < let.length(); i++) {
			
			replace = (int)let.charAt(i);
			
			if(let.charAt(i) >=97 && let.charAt(i) <=122){
				let = let.substring(0, i) + (char)(replace -32) + let.substring(i + 1);
				
			}
			else if(let.charAt(i) >=65 && let.charAt(i) <=90){
				
				let = let.substring(0, i) + (char)(replace +32) + let.substring(i + 1);
				
			}

		}

		System.out.println(let);
		
	}
}

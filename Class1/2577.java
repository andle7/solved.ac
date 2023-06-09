import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N[] = new int[3];
		int result = 1;
		String let = "";
		int let2[] = new int[10];
		
		for(int i = 0; i < N.length; i++) {
			N[0] = in.nextInt();
			result *= N[0];
		}
		
		let = Integer.toString(result);
	
		for(int i = 0; i < let.length(); i++) {	
			for(int j = 0; j< 10; j++) {
				
				if(Integer.valueOf(let.charAt(i))-48  == j) {
					let2[Integer.valueOf(let.charAt(i))-48]++;
					break;
				}
			}
			
		}
	
		
		for(int i = 0; i < let2.length; i++) {
			System.out.println(let2[i]);
		}
		
		
	}
}

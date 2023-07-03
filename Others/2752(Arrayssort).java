import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int N[] = new int[3];
		
		for (int i = 0; i < N.length; i++) {
			N[i] = Integer.parseInt(input[i]);
		}
		
		Arrays.sort(N);
		
		
		 for (int num : N) {
	            System.out.print(num + " ");
	        }
		
	}
}

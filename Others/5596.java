import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int S[] = new int[4];
		int T[] = new int[4];
		int sum1 = 0;
		int sum2 = 0;
		
		String input[] = br.readLine().split(" ");
		for (int i = 0; i < S.length; i++) {
			S[i] = Integer.parseInt(input[i]);
			sum1 += S[i];
		}
		
		input = br.readLine().split(" ");
		
		for (int i = 0; i < T.length; i++) {
			T[i] = Integer.parseInt(input[i]);
			sum2 += T[i];
		}
		
		
		if(sum1 >= sum2) {
			System.out.println(sum1);
		}else {
			System.out.println(sum2);
		}
		
		
	}
}

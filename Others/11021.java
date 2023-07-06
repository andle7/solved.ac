import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int let[][] = new int[N][2];
		
		String input[];
		
		for (int i = 0; i < N; i++) {
			input = br.readLine().split(" ");
			let[i][0] = Integer.parseInt(input[0]);
			let[i][1] = Integer.parseInt(input[1]);
		}
			
		for (int i = 0; i < N; i++) {
			System.out.println("Case #" + (i+1) + ": " + (let[i][0] + let[i][1]) );
		}

	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = 0;
		long B = 0;
		
 		while (true) {
			A = Integer.parseInt(st.nextToken());
			if (A >= 1 && A <= 10000) {
				break;
			}

		}

		while (true) {
			B = Integer.parseInt(st.nextToken());
			if (B >= 1 && B <= 10000) {
				break;
			}
		}
		
		long res = (A+B) * (A-B);
		
		System.out.println(res);
		
	
	}
}

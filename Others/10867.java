import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Number = Integer.parseInt(br.readLine());
		TreeSet<Integer> N = new TreeSet<>();
		
		String input[] = br.readLine().split(" ");
		
		for (int i = 0; i < Number; i++) {
			N.add(Integer.parseInt(input[i]));
		}
		
		 for (int num : N) {
	            System.out.print(num + " ");
	        }

	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class sort2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		ArrayList<Integer> N = new ArrayList<>(); 

		
		for (int i = 0; i < 3; i++) {
			 N.add(Integer.parseInt(input[i]));
		}
		
		Collections.sort(N);
			
		 for (int num : N) {
	            System.out.print(num + " ");
	        }
		
	}
}

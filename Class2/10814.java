import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class maxmin {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String let[][] = new String[N][2];
		
		for (int i = 0; i < let.length; i++) {
			String[] input = br.readLine().split(" ");
			let[i][0] = input[0];
			let[i][1] = input[1];
		}
		

		//Arrays.sort(let, (o1, o2) ->  o1[0].compareTo(o2[0]));
        
		
		Arrays.sort(let, new Comparator<String[]>() {
			@Override
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
			
		});
        
        
        
        

		for (int i = 0; i < let.length; i++) {
			System.out.println(let[i][0] +" " + let[i][1]);
		}

	}
}

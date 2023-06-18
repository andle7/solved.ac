import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		String let[] = new String[N];
		
		
		
		for (int i = 0; i < N; i++) {
	
			let[i] =  br.readLine();
	
		}
		
		
		
		Arrays.sort(let, (s1, s2) -> {
		    if (s1.length() == s2.length()) {
		        return s1.compareTo(s2);
		    } else {
		        return s1.length() - s2.length();
		    }
		});
		
		/*
		Arrays.sort(let, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} 
				else {
					return s1.length() - s2.length();
				}
			}
			
		});
		*/
		
		
		sb.append(let[0]).append('\n');
		
		for (int i = 1; i < N; i++) {
			if (!let[i].equals(let[i - 1])) {
				sb.append(let[i]).append('\n');
			}
		}
		System.out.println(sb);
		
	
		
		
	}
}
